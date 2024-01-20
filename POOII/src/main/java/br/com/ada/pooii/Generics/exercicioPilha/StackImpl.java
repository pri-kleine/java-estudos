package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioPilha;

import java.util.ArrayList;
import java.util.List;


public class StackImpl <E> implements Stack<E> {

    private final List<E> listInterna;

    public StackImpl(){
        this.listInterna = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        listInterna.add(elemento);
    }

    @Override
    public E pop() {
        return listInterna.remove(listInterna.size()-1);
    }

    @Override
    public E peek() {
        return listInterna.get(listInterna.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return listInterna.isEmpty();
    }

}
