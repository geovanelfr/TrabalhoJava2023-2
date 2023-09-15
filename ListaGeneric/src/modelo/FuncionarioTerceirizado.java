package modelo;

/**
 *
 * @author geovanelfr
 */
public class FuncionarioTerceirizado {
    
    protected String empresaTerceirizada;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }

    public String getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    public void setEmpresaTerceirizada(String empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }
    
    
}