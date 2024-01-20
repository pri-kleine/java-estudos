package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioPilha;

// Interface genérica para a estrutura Stack
public  interface  Stack<E> {

	void  push(E elemento);
	E pop();
	E peek();
	boolean  isEmpty();

}