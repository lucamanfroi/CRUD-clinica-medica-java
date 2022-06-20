package Control;

import Model.Medico;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicoControl {

    private final Medico medico;

    public MedicoControl() {
        this.medico = new Medico(); // Veja que control é um objeto vazio de Medico
    }

    // Create 
    public boolean Cadastrar(String nome, int idade, String endereco, String telefone, String crm, String especialidade, String periodo) throws SQLException {

        int id = medico.maiorID() + 1;
        Medico objeto = new Medico(id, nome, idade, endereco, telefone, crm, especialidade, periodo);
        if (medico.InsertMedicoBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Update
    public boolean Editar(int id, String nome, int idade, String endereco, String telefone, String crm, String especialidade, String periodo) {
        Medico objeto = new Medico(id, nome, idade, endereco, telefone, crm, especialidade, periodo);
        if (medico.UpdateMedicoBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    // Delete
    public boolean Apagar(int id) {
        if (medico.DeleteMedicoBD(id)) {
            return true;
        } else {
            return false;
        }
    }

    // Read
    public Medico LoadMedico(int id) {
        // procurar o Medico com este id e retornar um objeto com TODOS OS DADOS.
        return medico.carregaMedico(id);
    }

    // Read
    public ArrayList getMinhaLista() {
        return medico.getMinhaLista();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {

        ArrayList<Medico> minhalista = medico.getMinhaLista();
        int tamanho = minhalista.size();

        String MatrizMedicos[][] = new String[tamanho][8];
        for (int i = 0; i < tamanho; i++) {
            MatrizMedicos[i][0] = minhalista.get(i).getId() + "";
            MatrizMedicos[i][1] = minhalista.get(i).getNome();
            MatrizMedicos[i][2] = minhalista.get(i).getIdade() + "";
            MatrizMedicos[i][3] = minhalista.get(i).getEndereco();
            MatrizMedicos[i][4] = minhalista.get(i).getTelefone() + "";
            MatrizMedicos[i][5] = minhalista.get(i).getCrm() + "";
            MatrizMedicos[i][6] = minhalista.get(i).getEspecialidade();
            MatrizMedicos[i][7] = minhalista.get(i).getPeriodo();
        }

        return MatrizMedicos;
    }

    public boolean Cadastrar(String nome, int telefone, int crm, String especialidade, String periodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
