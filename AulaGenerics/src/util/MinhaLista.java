package util;

/**
 *
 * @author GLAUFER
 */
public class MinhaLista<E> {
    
    private E vet[];
    private int quantidade;

    public MinhaLista() {
        vet = (E[]) new Object[100];
    }
    

    public MinhaLista(int tamanho) {
        vet = (E[]) new Object[tamanho];
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    
    public void adicionar (E elemento){
        if(quantidade < vet.length){
        vet[quantidade] = elemento;
        quantidade++;
         }else{
            System.out.println("Lista cheia");
        }
    }
    
    public int posicaoDoElemento(E elemento){ 
        for (int i = 0; i < vet.length; i++) {
            E e = vet[i];
            if (e.equals(elemento)){
                return i;
            }            
        }
        return -1;
    }
    
    public void remover (E elemento) {
        int posicaoElemento = posicaoDoElemento(elemento);
        if(posicaoElemento == -1) {
            System.out.println("Elemento nao foi encontrado na lista!");
            return;
        }
        
        vet[posicaoElemento] = null;
        if (posicaoElemento != quantidade){
            for (int i = posicaoElemento+1; i <= quantidade; i++) {
                vet[i-1] = vet[i];
            }
        }
        quantidade --;
    }
    
    public E buscarElemento(int posicao){
        if(posicao > quantidade || posicao < 0){
            System.out.println("Posicao invalida");
            return null;
        }
        return vet[posicao];
    }
    
}
