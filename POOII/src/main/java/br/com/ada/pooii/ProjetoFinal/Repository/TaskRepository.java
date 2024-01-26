package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.PersonalTask;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository <T> implements RepositoryInterface<T> {

    List<T> lista;

    public TaskRepository(List<T> lista) {
        if (lista != null) this.lista = lista;
        else this.lista = new ArrayList<>();
    }

    public TaskRepository() {
        this(new ArrayList<>());
    }


    @Override
    public void salvar(T task) {
        System.out.println("salvando");
        lista.add(task);
    }
}
