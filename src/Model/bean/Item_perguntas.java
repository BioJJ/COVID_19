package Model.bean;

public class Item_perguntas {

    private int id;
    private Consulta consulta;
    private Pergunta pergunta;
    private String resposta;

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
     * @return the pergunta
     */
    public Pergunta getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * @return the resposta
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(String resposta) {
        this.resposta = resposta;
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
