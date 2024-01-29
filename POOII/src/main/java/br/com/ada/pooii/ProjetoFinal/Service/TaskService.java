package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.RepositoryInterface;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.TaskRepository;

import java.util.List;

public class TaskService<T> {
    private final TaskRepository<T> repository;

    public TaskService() {
        this.repository = new TaskRepository<>();
        this.repository.getAll().add((T) new Task("Tarefa exemplo", "Não Iniciada", 0));
    }

    public void salvarNovaTask(T task) {
        System.out.println("salvando a tarefa com o repository: " + this.repository.getClass().getName());
        repository.salvar(task);
    }

    public void listTasks() {
        // Obtenho a lista
        List<T> list = this.repository.getAll();
        if (list.isEmpty()) System.out.println("Lista vazia");
        else System.out.println(list);
    }
}
