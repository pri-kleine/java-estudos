package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioListaGenerica;

import java.util.ArrayList;
import java.util.List;
public class MinhaLista <T extends RegistroID<E>, E>{

    private final List<T> elementos = new ArrayList<>();

//    método adicionar(T elemento) - Função: Adiciona um elemento à lista.
    public void adicionar (T elemento) {
        this.elementos.add(elemento);
    }

//    método obter(int indice): T - Função: Retorna o elemento na posição especificada pelo índice.
    public T obter(int indice){
        return this.elementos.get(indice);
    }

//    método indice(U identificador): int - Função: Retorna a posicao do elemento pelo seu ID.
    public int indice (E identificador){
        for (int i = 0; i < this.elementos.size(); i++) {

            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(identificador);

            if (isIgual) {
                return i;
            }
        }
        return -1;
    }

//    método contem(T elemento): boolean - Função: Verifica se a lista contém o elemento especificado.
//    public T contem (T elemento){
//        return;
//    }
}
