package Control;

import Model.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteControl {

    private final Paciente paciente;

    public PacienteControl() {
        this.paciente = new Paciente();
    }

    // Create 
    public boolean Cadastrar(String nome, int idade, String endereco, String telefone, String nascimento) throws SQLException {

        int id = paciente.maiorID() + 1;
        Paciente objeto = new Paciente(id, nome, idade, endereco, telefone, nascimento);
        if (paciente.InsertPacienteBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Update
    public boolean Editar(int id, String nome, int idade, String endereco, String telefone, String nascimento) {
        Paciente objeto = new Paciente(id, nome, idade, endereco, telefone, nascimento);
        if (paciente.UpdatePacienteBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Delete
    public boolean Apagar(int id) {
        if (paciente.DeletePacienteBD(id)) {
            return true;
        } else {
            return false;
        }
    }

    // Read
    public Paciente LoadPaciente(int id) {

        return paciente.carregaPaciente(id);
    }

    // Read
    public ArrayList getMinhaLista() {
        return paciente.getMinhaLista();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {

        ArrayList<Paciente> minhalista = paciente.getMinhaLista();
        int tamanho = minhalista.size();

        String MatrizPacientes[][] = new String[tamanho][6];
        for (int i = 0; i < tamanho; i++) {
            MatrizPacientes[i][0] = minhalista.get(i).getId() + "";
            MatrizPacientes[i][1] = minhalista.get(i).getNome();
            MatrizPacientes[i][2] = minhalista.get(i).getIdade() + "";
            MatrizPacientes[i][3] = minhalista.get(i).getEndereco();
            MatrizPacientes[i][4] = minhalista.get(i).getTelefone() + "";
            MatrizPacientes[i][5] = minhalista.get(i).getNascimento();

        }

        return MatrizPacientes;
    }

}
