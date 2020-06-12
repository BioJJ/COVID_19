package Model.bean;

public class Item_selecionados {

    private int id;
    private Consulta consulta;
    private Sintomas sintoma;
    private Grau_Risco grau;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sintoma
     */
    public Sintomas getSintoma() {
        return sintoma;
    }

    /**
     * @param sintoma the sintoma to set
     */
    public void setSintoma(Sintomas sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return the grau
     */
    public Grau_Risco getGrau() {
        return grau;
    }

    /**
     * @param grau the grau to set
     */
    public void setGrau(Grau_Risco grau) {
        this.grau = grau;
    }

    /**
     * @return the consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
