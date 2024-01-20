package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioListaGenerica;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinhaLista<Pessoa, Long> listaDePessoas = new MinhaLista<>();
//        MinhaLista<Carro, Long> listaDeCarros = new MinhaLista<>();

        Pessoa jorge = new Pessoa(1L, "Jorge");
        listaDePessoas.adicionar(jorge);

        Pessoa maria = new Pessoa(2L, "Maria");
        listaDePessoas.adicionar(maria);

        Pessoa jess = new Pessoa(3L, "Jess");
        listaDePessoas.adicionar(jess);

        System.out.println("Elemento na posição 2: " + listaDePessoas.obter(2)); // Saída: Pessoa[id=3, nome="jess]
//        System.out.println("A lista contém a pessoa maria? " + listaDePessoas.contem(maria)); // Saída: true
//        System.out.println("Qual a posicao do elemento de ID 3? " + listaDePessoas.indice(3)); // Saída: 2



    }
}
