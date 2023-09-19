package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MinhaLista <E extends IExibirInformacoes & IChaveConsulta<K>, K> implements Collection<E>, List<E>{
    
    private List<E> lista = new ArrayList<>();
    
    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return lista.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return lista.iterator();
    }

    @Override
    public Object[] toArray() {
        return lista.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return lista.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return lista.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return lista.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return lista.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return lista.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return lista.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return lista.retainAll(c);
    }

    @Override
    public void clear() {
        lista.clear();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return lista.addAll(index, c);
    }

    @Override
    public E get(int index) {
        return lista.get(index);
    }

    @Override
    public E set(int index, E element) {
        return lista.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        lista.add(index, element);
    }

    @Override
    public E remove(int index) {
        return lista.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return lista.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return lista.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return lista.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return lista.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return lista.subList(fromIndex, toIndex);
    }
    
     public void exibirLista() {
        for (E elemento : lista) {
            elemento.exibirInformacoes();
        }
    }

    public void exibirListaOrdenada() {
        List<E> copiaOrdenada = new ArrayList<>(lista);
        copiaOrdenada.sort(Comparator.comparing(E::getChave));
        for (E elemento : copiaOrdenada) {
            elemento.exibirInformacoes();
        }
    }

        public void ordenarLista() {
            lista.sort(Comparator.comparing(E::getChave));
        }

        public void ordenarListaDecrescente() {
            lista.sort(Comparator.comparing(E::getChave).reversed());
        }

    public E pesquisar(K chaveBusca) {
        for (E elemento : lista) {
            if (elemento.getChave().equals(chaveBusca)) {
                return elemento;
            }
        }
        return null; // Ou lançar uma exceção se não encontrar
    }

    public MinhaLista<E, K> pesquisarPorVariasChaves(List<K> chavesBusca) {
        MinhaLista<E, K> resultado = new MinhaLista<>();
        for (K chave : chavesBusca) {
            E elemento = pesquisar(chave);
            if (elemento != null) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    public MinhaLista<E, K> filtrar(K chaveBusca) {
        MinhaLista<E, K> resultado = new MinhaLista<>();
        for (E elemento : lista) {
            if (elemento.getChave().equals(chaveBusca)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    public MinhaLista<E, K> filtrarPorVariasChaves(List<K> chavesBusca) {
        MinhaLista<E, K> resultado = new MinhaLista<>();
        for (E elemento : lista) {
            if (chavesBusca.contains(elemento.getChave())) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }
}
