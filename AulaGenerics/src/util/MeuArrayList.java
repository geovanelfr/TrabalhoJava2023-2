package util;

import java.util.ArrayList;

/**
 *
 * @author GLAUFER
 */
public class MeuArrayList <E> extends ArrayList <E> {
    
    public void exibirLista() {
        for (E elemento : this){
            System.out.println(elemento);
            }
    }
    
}
