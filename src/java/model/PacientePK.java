
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

public class PacientePK implements Serializable {
    private int idPaciente;
    private String numSUS;

    public PacientePK() {
    }

    public PacientePK(int idPaciente, String numSUS) {
        this.idPaciente = idPaciente;
        this.numSUS = numSUS;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNumSUS() {
        return numSUS;
    }

    public void setNumSUS(String numSUS) {
        this.numSUS = numSUS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (numSUS != null ? numSUS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacientePK)) {
            return false;
        }
        PacientePK other = (PacientePK) object;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if ((this.numSUS == null && other.numSUS != null) || (this.numSUS != null && !this.numSUS.equals(other.numSUS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dao.PacienteDAOPK[ idPaciente=" + idPaciente + ", numSUS=" + numSUS + " ]";
    }
    
}
