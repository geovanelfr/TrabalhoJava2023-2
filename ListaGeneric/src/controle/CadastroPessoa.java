package controle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import modelo.Pessoa;
import util.Input;
import util.DialogoBoxUtils;

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
            DialogoBoxUtils.exibirMensagem("Pessoa não encotrada", "Nenhuma pessoa foi encontrada!");
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
        listar(listaPessoas, "Pessoas", true);
    }
    
    protected void listar (List<Pessoa> listaPessoas, String entidadeModelo, boolean exibirMenulista) {
        int resp = 1;
        if (exibirMenulista) {
            resp = menuListar();
        }
        switch (resp){
            case 1 -> 
                ordenarLista(listaPessoas, true);
            case 2 -> 
                ordenarLista(listaPessoas, false);
            default ->
                System.out.println("\nEscolha Invalida!\n");
        }
        if (listaPessoas.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        System.out.println("\n------------------Lista de "+ entidadeModelo +"------------------------");
        for (Pessoa p : listaPessoas) {
            p.exibirInformacao();
        }
        System.out.println("Total de registros: "+ listaPessoas.size() + "\n");
    }
    
    protected int menuListar() {
        System.out.println("Informe a forma de ordenacao");
        System.out.println("\n1 - Crescente \n2 - Decrescente");
        System.out.println("opcao: ");
        return Input.nextInt();
    }

    protected void ordenarLista(ArrayList<Pessoa> lista, int ordem ) {
        switch (ordem) {
            case 1 -> 
                ordenarLista (lista, true);
            case 2 ->
                ordenarLista (lista, false);
        }   
    }
    
    protected void ordenarLista(List<Pessoa> lista, boolean ordemCrescente){
        if (ordemCrescente) {
            Collections.sort(lista);
        }else {
            Collections.sort(lista, Collections.reverseOrder());
        }
        
    }
    
    
}
