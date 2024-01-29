package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository<T> implements RepositoryInterface<T> {

    List<T> lista;

    public TaskRepository(List<T> lista) {
        if (lista != null) this.lista = lista;
        else this.lista = new ArrayList<>();
//        Task tarefa1 =new Task("boleto", "pedente",1);
//        lista.add(tarefa1);
    }

    public TaskRepository() {
        //duvida - pode ser this.lista = new ArrayList<>(); pode apagar a anterior?
        this(new ArrayList<>());
    }


    public void salvar(T task) {
        System.out.println("salvando");
        lista.add(task);
    }

    public List<T> getAll() {
        return this.lista;
    }


}
