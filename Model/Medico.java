package Model;

import java.util.*;
import DAO.MedicoDAO;
import java.sql.SQLException;

public class Medico extends Pessoa {

    // Atributos
    private String crm;
    private String especialidade;
    private String periodo;
    private final MedicoDAO dao;

    public Medico() {
        this.dao = new MedicoDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor de Objeto, inserindo dados
    public Medico(String crm, String especialidade, String periodo) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.dao = new MedicoDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor usando também o construtor da SUPERCLASSE
    public Medico(int id, String nome, int idade, String endereco, String telefone, String crm, String especialidade, String periodo) {
        super(id, nome, idade, endereco, telefone);
        this.crm = crm;
        this.especialidade = especialidade;
        this.periodo = periodo;
        this.dao = new MedicoDAO(); // inicializado não importa em qual construtor
    }

    // Métodos GET e SET
    // Override necessário para poder retornar os dados de Pessoa no toString para medico.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Endereco: " + this.getEndereco()
                + "\n Telefone:" + this.getTelefone()
                + "\n CRM:" + this.getCrm()
                + "\n Periodo:" + this.getPeriodo()
                + "\n Especialidade:" + this.getEspecialidade()
                + "\n -----------";
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /*
    
        ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO
    
     */
    // Retorna a Lista de Medico(objetos)
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastra novo Medico
    public boolean InsertMedicoBD(Medico objeto) {
        dao.InsertMedicoBD(objeto);
        return true;
    }

    // Deleta um medico específico pelo seu campo ID
    public boolean DeleteMedicoBD(int id) {
        dao.DeleteMedicoBD(id);
        return true;
    }

    // Edita um medico específico pelo seu campo ID
    public boolean UpdateMedicoBD(Medico objeto) {
        dao.UpdateMedicoBD(objeto);
        return true;
    }

    // carrega dados de um medico específico pelo seu ID
    public Medico carregaMedico(int id) {
        dao.carregaMedico(id);
        return null;
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}
