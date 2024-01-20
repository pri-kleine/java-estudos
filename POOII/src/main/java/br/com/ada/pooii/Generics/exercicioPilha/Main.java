package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioPilha;

public class Main {
    public static void main(String[] args) {

    Stack<String> minhaStack = new StackImpl<>();
    String nome;
    Boolean verdade;

    verdade = minhaStack.isEmpty();
    System.out.println(verdade);

    minhaStack.push("Lucia");
    minhaStack.push("Maria");
    minhaStack.push("Joana");
    minhaStack.push("Vera");
    minhaStack.push("Bel");
    minhaStack.push("Carol");

    minhaStack.isEmpty();

    verdade = minhaStack.isEmpty();
    System.out.println(verdade);
    minhaStack.push("Eu");

    System.out.println(minhaStack.toString());
//
    nome = minhaStack.pop();
        System.out.println(nome);

    nome =minhaStack.peek();
        System.out.println(nome);

    nome = minhaStack.pop();
        System.out.println(nome);

    nome =minhaStack.peek();
        System.out.println(nome);


    }
}
