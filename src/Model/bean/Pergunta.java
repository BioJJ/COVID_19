package Model.bean;

public class Pergunta {
    private int id;
    private String pergunta;

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
    public String getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    
      @Override
    public String toString() {
        return getPergunta(); //To change body of generated methods, choose Tools | Templates.
    }
}
