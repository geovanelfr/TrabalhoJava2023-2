package modelo;

/**
 *
 * @author geovanelfr
 */
public class Aluno extends Pessoa{
    
    protected String ra;

    public Aluno() {
    }

    public Aluno(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
}
