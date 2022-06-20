package DAO;

import Model.Medico;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {

    public static ArrayList<Medico> MinhaLista = new ArrayList<Medico>();

    public MedicoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_medico");
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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_medico");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                int idade = res.getInt("idade");
                String endereco = res.getString("endereco");
                String telefone = res.getString("telefone");
                String crm = res.getString("crm");
                String especialidade = res.getString("especialidade");
                String periodo = res.getString("periodo");

                Medico objeto = new Medico(id, nome, idade, endereco, telefone, crm, especialidade, periodo);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    // Cadastrar Novo Médico
    public boolean InsertMedicoBD(Medico objeto) {
        String sql = "INSERT INTO tb_medico(id,nome,idade,endereco,telefone,crm,especialidade,periodo) VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getEndereco());
            stmt.setString(5, objeto.getTelefone());
            stmt.setString(6, objeto.getCrm());
            stmt.setString(7, objeto.getEspecialidade());
            stmt.setString(8, objeto.getPeriodo());
            
            System.out.println(objeto.getId() +
                    objeto.getNome() +
                    objeto.getIdade() +
                    objeto.getEndereco() +
                    objeto.getTelefone() +
                    objeto.getCrm() +
                    objeto.getEspecialidade() +
                    objeto.getPeriodo());
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    // Deletar um Médico através da PK
    public boolean DeleteMedicoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_medico WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {

        }
        return true;
    }

    // Editar um Médico através da PK
    public boolean UpdateMedicoBD(Medico objeto) {

        String sql = "UPDATE tb_medico set nome = ?, idade = ?, endereco = ?, telefone = ?, crm = ?, especialidade = ?, periodo = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getEndereco());
            stmt.setString(4, objeto.getTelefone());
            stmt.setString(5, objeto.getCrm());
            stmt.setString(6, objeto.getEspecialidade());
            stmt.setString(7, objeto.getPeriodo());
            stmt.setInt(8, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Medico carregaMedico(int id) {

        Medico objeto = new Medico();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from tb_medico WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setEndereco(res.getString("endereco"));
            objeto.setTelefone(res.getString("telefone"));
            objeto.setCrm(res.getString("crm"));
            objeto.setEspecialidade(res.getString("especialidade"));
            objeto.setPeriodo(res.getString("periodo"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;

    }
}
