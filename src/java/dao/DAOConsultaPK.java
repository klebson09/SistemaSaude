/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CLEBISON
 */
@Embeddable
public class DAOConsultaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idConsulta")
    private int idConsulta;
    @Basic(optional = false)
    @Column(name = "Paciente_idPaciente")
    private int pacienteidPaciente;
    @Basic(optional = false)
    @Column(name = "Paciente_numSUS")
    private String pacientenumSUS;
    @Basic(optional = false)
    @Column(name = "MEdico_idMEdico")
    private int mEdicoidMEdico;
    @Basic(optional = false)
    @Column(name = "MEdico_CRM")
    private String mEdicoCRM;

    public DAOConsultaPK() {
    }

    public DAOConsultaPK(int idConsulta, int pacienteidPaciente, String pacientenumSUS, int mEdicoidMEdico, String mEdicoCRM) {
        this.idConsulta = idConsulta;
        this.pacienteidPaciente = pacienteidPaciente;
        this.pacientenumSUS = pacientenumSUS;
        this.mEdicoidMEdico = mEdicoidMEdico;
        this.mEdicoCRM = mEdicoCRM;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getPacienteidPaciente() {
        return pacienteidPaciente;
    }

    public void setPacienteidPaciente(int pacienteidPaciente) {
        this.pacienteidPaciente = pacienteidPaciente;
    }

    public String getPacientenumSUS() {
        return pacientenumSUS;
    }

    public void setPacientenumSUS(String pacientenumSUS) {
        this.pacientenumSUS = pacientenumSUS;
    }

    public int getMEdicoidMEdico() {
        return mEdicoidMEdico;
    }

    public void setMEdicoidMEdico(int mEdicoidMEdico) {
        this.mEdicoidMEdico = mEdicoidMEdico;
    }

    public String getMEdicoCRM() {
        return mEdicoCRM;
    }

    public void setMEdicoCRM(String mEdicoCRM) {
        this.mEdicoCRM = mEdicoCRM;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idConsulta;
        hash += (int) pacienteidPaciente;
        hash += (pacientenumSUS != null ? pacientenumSUS.hashCode() : 0);
        hash += (int) mEdicoidMEdico;
        hash += (mEdicoCRM != null ? mEdicoCRM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DAOConsultaPK)) {
            return false;
        }
        DAOConsultaPK other = (DAOConsultaPK) object;
        if (this.idConsulta != other.idConsulta) {
            return false;
        }
        if (this.pacienteidPaciente != other.pacienteidPaciente) {
            return false;
        }
        if ((this.pacientenumSUS == null && other.pacientenumSUS != null) || (this.pacientenumSUS != null && !this.pacientenumSUS.equals(other.pacientenumSUS))) {
            return false;
        }
        if (this.mEdicoidMEdico != other.mEdicoidMEdico) {
            return false;
        }
        if ((this.mEdicoCRM == null && other.mEdicoCRM != null) || (this.mEdicoCRM != null && !this.mEdicoCRM.equals(other.mEdicoCRM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dao.DAOConsultaPK[ idConsulta=" + idConsulta + ", pacienteidPaciente=" + pacienteidPaciente + ", pacientenumSUS=" + pacientenumSUS + ", mEdicoidMEdico=" + mEdicoidMEdico + ", mEdicoCRM=" + mEdicoCRM + " ]";
    }
    
}
