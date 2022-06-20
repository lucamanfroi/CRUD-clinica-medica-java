package Model;

import java.util.*;
import DAO.PacienteDAO;
import java.sql.SQLException;

public class Paciente extends Pessoa {

    // Atributos
    private String nascimento;
    private final PacienteDAO dao;

    public Paciente() {
        this.dao = new PacienteDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor de Objeto, inserindo dados
    public Paciente(String nascimento) {
        this.nascimento = nascimento;
        this.dao = new PacienteDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor usando também o construtor da SUPERCLASSE
    public Paciente(int id, String nome, int idade, String endereco, String telefone, String nascimento) {
        super(id, nome, idade, endereco, telefone);
        this.nascimento = nascimento;

        this.dao = new PacienteDAO(); // inicializado não importa em qual construtor
    }

    // Métodos GET e SET
    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    // Override necessário para poder retornar os dados de Pessoa no toString para medico.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Endereco: " + this.getEndereco()
                + "\n Telefone:" + this.getTelefone()
                + "\n Nascimento:" + this.getNascimento()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO
    
     */
    // Retorna a Lista de Medico(objetos)
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastra novo paciente
    public boolean InsertPacienteBD(Paciente objeto) {
        dao.InsertPacienteBD(objeto);
        return true;
    }

    // Deleta um paciente específico pelo seu campo ID
    public boolean DeletePacienteBD(int id) {
        dao.DeletePacienteBD(id);
        return true;
    }

    // Edita um paciente específico pelo seu campo ID
    public boolean UpdatePacienteBD(Paciente objeto) {
        dao.UpdatePacienteBD(objeto);
        return true;
    }

    // carrega dados de um paciente específico pelo seu ID
    public Paciente carregaPaciente(int id) {
        dao.carregaPaciente(id);
        return null;
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}
