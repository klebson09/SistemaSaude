/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

public class Paciente extends Pessoa implements Serializable {
//    protected PacientePK pacienteDAOPK;
//    private Pessoa pessoaidPessoa;
//    
    private Integer idPaciente;
    private String numSUS;
    private Integer PessoaIdPessoa;

    
       //relacionamento Herança
//    public Paciente(PacientePK pacienteDAOPK, Pessoa pessoaidPessoa, Integer idPaciente, String numSUS, Integer PessoaIdPessoa) {
//    public Paciente(Integer idPaciente, String numSUS, Integer PessoaIdPessoa) {
////        this.pacienteDAOPK = pacienteDAOPK;
////        this.pessoaidPessoa = pessoaidPessoa;
//        this.idPaciente = idPaciente;
//        this.numSUS = numSUS;
//        this.PessoaIdPessoa = PessoaIdPessoa;
//    }

    public Paciente(Integer idPaciente, String numSUS, Integer PessoaIdPessoa) {
        this.idPaciente = idPaciente;
        this.numSUS = numSUS;
        this.PessoaIdPessoa = PessoaIdPessoa;
    }
      public Paciente(){
      }
    
    
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNumSUS() {
        return numSUS;
    }

    public void setNumSUS(String numSUS) {
        this.numSUS = numSUS;
    }

    public Integer getPessoaIdPessoa() {
        return PessoaIdPessoa;
    }

    public void setPessoaIdPessoa(Integer PessoaIdPessoa) {
        this.PessoaIdPessoa = PessoaIdPessoa;
    }
    
 
//    public Paciente(PacientePK pacienteDAOPK) {
//        this.pacienteDAOPK = pacienteDAOPK;
//    }
//
//    public Paciente(int idPaciente, String numSUS) {
//        this.pacienteDAOPK = new PacientePK(idPaciente, numSUS);
//    }
//
//    public PacientePK getPacienteDAOPK() {
//        return pacienteDAOPK;
//    }
//
//    public void setPacienteDAOPK(PacientePK pacienteDAOPK) {
//        this.pacienteDAOPK = pacienteDAOPK;
//    }
//
//    public Pessoa getPessoaidPessoa() {
//        return pessoaidPessoa;
//    }
//
//    public void setPessoaidPessoa(Pessoa pessoaidPessoa) {
//        this.pessoaidPessoa = pessoaidPessoa;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (pacienteDAOPK != null ? pacienteDAOPK.hashCode() : 0);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Paciente)) {
//            return false;
//        }
//        Paciente other = (Paciente) object;
//        if ((this.idPaciente != null && other.pacienteDAOPK != null) || (this.pacienteDAOPK != null && !this.pacienteDAOPK.equals(other.pacienteDAOPK))) {
//            return false;
//        }
//        return true;
//    }

    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        return "com.dao.PessoaDAO[ idPessoa=" + idPaciente + " ]";
    }
    
//    @Override
//    public String toString() {
//        return "com.dao.PacienteDAO[ pacienteDAOPK=" + pacienteDAOPK + " ]";
//    }
//
//    public String getPaciente_numSUS() {
//        return numSUS
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setPaciente_numSUS(int aInt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
