package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;
import util.Input;

/**
 *
 * @author geovanelfr
 */
public abstract class CadastroPessoa implements ICadastro{
    
    protected ArrayList<Pessoa> listaPessoas = new ArrayList<>(); 
            
        public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoas;
        }
        
    protected void setarDados(Pessoa p) {
        System.out.println("Nome: ");
        p.setNome(Input.nextLine());
        System.out.println("cpf: ");
        p.setCpf(Input.nextLine());
        System.out.println("Data de nascimento: : ");
        p.setDataNascimento(Input.nextLocalDate());
        System.out.println("Nome: ");
        CadastroEndereco.setarDadosEndereco(p.getEndereco());
    }
 
    @Override
    public abstract void cadastrar();

    @Override
    public void alterar() {
        
    }

    @Override
    public void remover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     @Override
    public void pesquisar() {
        List<Pessoa> resultado = pesquisaContains(listaPessoas);

        if (resultado.isEmpty()) {
            DialogBoxUtils.exibirMensagem("Pessoa não encotrada", "Nenhuma pessoa foi encontrada!");
        } else {
            listar(resultado, "Pessoas", false);
        }
    }

    public List<Pessoa> pesquisaContains(List<Pessoa> pessoas) {
        System.out.println("Informe o nome ou cpf: ");
        String dadoBusca = Input.nextLine();
        return pesquisaContains(pessoas, dadoBusca.toLowerCase());
    }

    protected ArrayList<Pessoa> pesquisaContains(List<Pessoa> listaPessoas, String dadoBusca) {
        ArrayList<Pessoa> resultado = new ArrayList<>();
        for (Pessoa listaPessoa : listaPessoas) {
            if (listaPessoa.getNome().toLowerCase().contains(dadoBusca) || listaPessoa.getCpf().contains(dadoBusca)) {
                resultado.add(listaPessoa);
            }
        }
        return resultado;
    }

    
    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
