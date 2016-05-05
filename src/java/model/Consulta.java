package model;

public class Consulta {

    private int idConsulta;
    private int pacienteidPaciente;
    private String pacientenumSUS;
    private int MedicoidMEdico;
    private String MedicoCRM;

    private static final long serialVersionUID = 1L;
    private String tipoConsulta;
    private String observacao;
    private byte[] arquivoConsulta;

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

    public int getMedicoidMEdico() {
        return MedicoidMEdico;
    }

    public void setMedicoidMEdico(int M3dicoidMEdico) {
        this.MedicoidMEdico = MedicoidMEdico;
    }

    public String getMedicoCRM() {
        return MedicoCRM;
    }

    public void setMedicoCRM(String MedicoCRM) {
        this.MedicoCRM = MedicoCRM;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public byte[] getArquivoConsulta() {
        return arquivoConsulta;
    }

    public void setArquivoConsulta(byte[] arquivoConsulta) {
        this.arquivoConsulta = arquivoConsulta;
    }

}
