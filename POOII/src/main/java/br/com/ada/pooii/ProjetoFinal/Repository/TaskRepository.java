package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements RepositoryInterface<Task> {

    List<Task> lista;

    public TaskRepository() {
        this.lista = (new ArrayList<>());
    }

    public void create(Task task) {
        System.out.println("salvando");
        lista.add(task);
    }

    @Override
    public List<Task> read() {
        return this.lista;
    }

    @Override
    public void update(Integer id, Task task) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                this.lista.set(i, task);
                break;
            }
        }
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }
    }

}
