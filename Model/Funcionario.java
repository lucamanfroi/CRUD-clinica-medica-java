package Model;

import java.util.*;
import DAO.FuncionarioDAO;
import java.sql.SQLException;

public class Funcionario extends Pessoa {

    String cpf;
    int numero;
    String cep;
    String referencia;
    private final FuncionarioDAO dao;

    public Funcionario() {
        this.dao = new FuncionarioDAO();
    }

    public Funcionario(String cpf, int numero, String cep, String referencia) {
        this.cpf = cpf;
        this.numero = numero;
        this.cep = cep;
        this.referencia = referencia;
        this.dao = new FuncionarioDAO();
    }

    public Funcionario(int id, int numero, String cep, String referencia, String cpf, String nome, int idade, String endereco, String telefone) {
        super(id, nome, idade, endereco, telefone);
        this.cpf = cpf;
        this.numero = numero;
        this.cep = cep;
        this.referencia = referencia;
        this.dao = new FuncionarioDAO();
    }

    public Funcionario(int id, String nome, int idade, String endereco, String telefone, String cpf, int numero, String cep, String referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Endereco: " + this.getEndereco()
                + "\n Telefone:" + this.getTelefone()
                + "\n CPF:" + this.getCpf()
                + "\n Numero:" + this.getNumero()
                + "\n Cep:" + this.getCep()
                + "\n Referencia:" + this.getReferencia()
                + "\n -----------";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }
    
    public boolean InsertFuncionarioBD(Funcionario objeto) {
        dao.InsertFuncionarioBD(objeto);
        return true;
    }
    
    public boolean DeleteFuncionarioBD(int id) {
        dao.DeleteFuncionarioBD(id);
        return true;
    }

    // Edita um medico específico pelo seu campo ID
    public boolean UpdateFuncionarioBD(Funcionario objeto) {
        dao.UpdateFuncionarioBD(objeto);
        return true;
    }

    // carrega dados de um medico específico pelo seu ID
    public Funcionario carregaFuncionario(int id) {
        dao.carregaFuncionario(id);
        return null;
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }

}
