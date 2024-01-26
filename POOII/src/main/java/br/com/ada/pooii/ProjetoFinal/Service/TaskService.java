package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.RepositoryInterface;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.TaskRepository;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public <T> void salvarNovaTask(T task) {
        System.out.println("salvando a tarefa com o repository: " + this.repository.getClass().getName());
        repository.salvar(task);

    }
}
