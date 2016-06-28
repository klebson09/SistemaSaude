/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
//import java.util.Collection;
//import java.util.Date;

public class Pessoa implements Serializable {

    private Integer idPessoa;
    private String nome;
    private String dataNasc;
    private String cpf;
    private String rg;
    private String email;
    private String pwd;
//    private String logradouro;
//    private String complemento;
//    private int numero;
//    private String cidade;
//    private String estado;
//    private String cep;
//    private Collection<Paciente> pacienteDAOCollection;
//    private Endereco enderecoidEndereco;

    public Pessoa(Integer idPessoa, String nome, String dataNasc, String cpf, String rg, String email, String pwd, String logradouro, String complemento, int numero, String cidade, String estado, String cep) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.pwd = pwd;
//        this.logradouro = logradouro;
//        this.complemento = complemento;
//        this.numero = numero;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.cep = cep;
    }

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

//    public Collection<Paciente> getPacienteDAOCollection() {
//        return pacienteDAOCollection;
//    }
//
//    public void setPacienteDAOCollection(Collection<Paciente> pacienteDAOCollection) {
//        this.pacienteDAOCollection = pacienteDAOCollection;
//    }
//
//    public Endereco getEnderecoidEndereco() {
//        return enderecoidEndereco;
//    }
//
//    public void setEnderecoidEndereco(Endereco enderecoidEndereco) {
//        this.enderecoidEndereco = enderecoidEndereco;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "com.dao.PessoaDAO[ idPessoa=" + idPessoa + " ]";
//    }
// retirar esse metodo usado apenas para teste
//    public void setDataNasc(String dataNasc) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    

//    public String getLogradouro() {
//        return logradouro;
//    }
//
//    public void setLogradouro(String logradouro) {
//        this.logradouro = logradouro;
//    }
//
//    public String getComplemento() {
//        return complemento;
//    }
//
//    public void setComplemento(String complemento) {
//        this.complemento = complemento;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(int numero) {
//        this.numero = numero;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getCep() {
//        return cep;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }

}
