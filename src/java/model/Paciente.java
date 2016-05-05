/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    protected PacientePK pacienteDAOPK;
    //relacionamento Herança
    private Pessoa pessoaidPessoa;

    public Paciente() {
    }

    public Paciente(PacientePK pacienteDAOPK) {
        this.pacienteDAOPK = pacienteDAOPK;
    }

    public Paciente(int idPaciente, String numSUS) {
        this.pacienteDAOPK = new PacientePK(idPaciente, numSUS);
    }

    public PacientePK getPacienteDAOPK() {
        return pacienteDAOPK;
    }

    public void setPacienteDAOPK(PacientePK pacienteDAOPK) {
        this.pacienteDAOPK = pacienteDAOPK;
    }

    public Pessoa getPessoaidPessoa() {
        return pessoaidPessoa;
    }

    public void setPessoaidPessoa(Pessoa pessoaidPessoa) {
        this.pessoaidPessoa = pessoaidPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pacienteDAOPK != null ? pacienteDAOPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.pacienteDAOPK == null && other.pacienteDAOPK != null) || (this.pacienteDAOPK != null && !this.pacienteDAOPK.equals(other.pacienteDAOPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dao.PacienteDAO[ pacienteDAOPK=" + pacienteDAOPK + " ]";
    }

    public String getPacientenumSUS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPaciente_numSUS(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
