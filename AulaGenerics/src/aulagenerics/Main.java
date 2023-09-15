package aulagenerics;

import util.MeuArrayList;

/**
 *
 * @author GLAUFER
 */
public class Main{

    public static void main(String[] args) {
        
        MeuArrayList<String> lista1 = new MeuArrayList<>();
        MeuArrayList<Integer> lista2 = new MeuArrayList<>();
        MeuArrayList<Double> lista4 = new MeuArrayList<>();

        
        lista1.add("Aula poo");
        lista1.add("TADS");
       
        lista2.add(10);
        lista2.add(54);
        
        lista4.add(4.4);
        lista4.add(10.0);
        
        //exibirLista(lista2);
        //exibirLista(lista4);
        /*
        for (int i = 0; i < lista1.getQuantidade(); i++) {
            System.out.println(lista1.buscarElemento(i));
        }
        System.out.println("");
        
        for (int i = 0; i < lista2.getQuantidade(); i++) {
            System.out.println(lista2.buscarElemento(i));
        }
        System.out.println();
        */
        
        lista2.exibirLista();
        lista4.exibirLista();
        
    }
    
    /*public static <E> void exibirLista(MeuArrayList<E> lista) {
         for (int i = 0; i < lista.size(); i++) {
             System.out.println(lista.buscarElemento(i));
        }
        
    }*/
    
    
    
}
