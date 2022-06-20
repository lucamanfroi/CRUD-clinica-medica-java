package CONTROL;

import Model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioControl {

    private final Funcionario funcionario;

    public FuncionarioControl() {
        this.funcionario = new Funcionario(); // Veja que control é um objeto vazio de Medico
    }

    public boolean Cadastrar(String nome, int idade, String telefone, String endereco, String cpf, int numero, String cep, String referencia) throws SQLException {

        int id = funcionario.maiorID() + 1;
        Funcionario objeto = new Funcionario(id, nome, idade, endereco, telefone, cpf, numero, cep, referencia);
        if (funcionario.InsertFuncionarioBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Update
    public boolean Editar(int id, int numero, String cep, String referencia, String cpf, String nome, int idade, String endereco, String telefone) {
        Funcionario objeto = new Funcionario(id, numero, cep, referencia, cpf, nome, idade, endereco, telefone);
        if (funcionario.InsertFuncionarioBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Delete
    public boolean Apagar(int id) {
        if (funcionario.DeleteFuncionarioBD(id)) {
            return true;
        } else {
            return false;
        }
    }

    // Read
    public Funcionario LoadFuncionario(int id) {
        return funcionario.carregaFuncionario(id);
    }

    // Read
    public ArrayList getMinhaLista() {
        return funcionario.getMinhaLista();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {

        ArrayList<Funcionario> minhalista = funcionario.getMinhaLista();
        int tamanho = minhalista.size();

        String MatrizFuncionarios[][] = new String[tamanho][9];
        for (int i = 0; i < tamanho; i++) {
            MatrizFuncionarios[i][0] = minhalista.get(i).getId() + "";
            MatrizFuncionarios[i][1] = minhalista.get(i).getNome();
            MatrizFuncionarios[i][2] = minhalista.get(i).getIdade() + "";
            MatrizFuncionarios[i][3] = minhalista.get(i).getEndereco();
            MatrizFuncionarios[i][4] = minhalista.get(i).getTelefone() + "";
            MatrizFuncionarios[i][5] = minhalista.get(i).getCpf();
            MatrizFuncionarios[i][5] = minhalista.get(i).getNumero() + "";
            MatrizFuncionarios[i][5] = minhalista.get(i).getCep();
            MatrizFuncionarios[i][8] = minhalista.get(i).getReferencia();
        }

        return MatrizFuncionarios;
    }}


