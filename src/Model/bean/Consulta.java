package Model.bean;

public class Consulta {

    private int id;
    private String statuss;
    private Pessoas pessoa;
    private String idade;
    private String temp;
    private String press;

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
     * @return the statuss
     */
    public String getStatuss() {
        return statuss;
    }

    /**
     * @param statuss the statuss to set
     */
    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }

    /**
     * @return the pessoa
     */
    public Pessoas getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }

    /**
     * @return the press
     */
    public String getPress() {
        return press;
    }

    /**
     * @param press the press to set
     */
    public void setPress(String press) {
        this.press = press;
    }

}
