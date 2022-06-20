package DAO;

import Model.Funcionario;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {
    
    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();
    
    public FuncionarioDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_funcionario");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }
    
    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_clinica";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "abcd1234";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar...");
            return null;
        }
    }
    
    public ArrayList getMinhaLista() {

        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_funcionario");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                int idade = res.getInt("idade");
                String endereco = res.getString("endereco");
                String telefone = res.getString("telefone");
                String cpf = res.getString("cpf");
                int numero = res.getInt("numero");
                String cep = res.getString("cep");
                String referencia = res.getString("referencia");

                Funcionario objeto = new Funcionario(id, nome, idade, endereco, telefone, cpf, numero, cep, referencia);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }
    
    public boolean InsertFuncionarioBD(Funcionario objeto) {
        String sql = "INSERT INTO tb_funcionario(id, nome, idade, endereco, telefone, cpf, numero, cep, referencia) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getEndereco());
            stmt.setString(5, objeto.getTelefone());
            stmt.setString(6, objeto.getCpf());
            stmt.setInt(7, objeto.getNumero());
            stmt.setString(8, objeto.getCep());
            stmt.setString(9, objeto.getReferencia());
            
            System.out.println(objeto.getId() +
                    objeto.getNome() +
                    objeto.getIdade() +
                    objeto.getEndereco() +
                    objeto.getTelefone() +
                    objeto.getCpf() +
                    objeto.getNumero() +
                    objeto.getCep() +
                    objeto.getReferencia());
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean DeleteFuncionarioBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_funcionario WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {

        }
        return true;
    }
    
    public boolean UpdateFuncionarioBD(Funcionario objeto) {

        String sql = "UPDATE tb_funcionario set nome = ?, idade = ?, endereco = ?, telefone = ?, cpf = ?, numero = ?, cep = ?, referencia = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getEndereco());
            stmt.setString(4, objeto.getTelefone());
            stmt.setString(5, objeto.getCpf());
            stmt.setInt(6, objeto.getNumero());
            stmt.setString(7, objeto.getCep());
            stmt.setString(7, objeto.getReferencia());
            stmt.setInt(8, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    public Funcionario carregaFuncionario(int id) {

        Funcionario objeto = new Funcionario();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from tb_funcionario WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setEndereco(res.getString("endereco"));
            objeto.setTelefone(res.getString("telefone"));
            objeto.setCpf(res.getString("cpf"));
            objeto.setNumero(res.getInt("numero"));
            objeto.setCep(res.getString("cep"));
            objeto.setReferencia(res.getString("referencia"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;

    }



}
