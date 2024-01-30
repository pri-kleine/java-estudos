package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository repository;

    public TaskService() {
        this.repository = new TaskRepository();
    }

    public void salvarNovaTask(Task task) {
        repository.create(task);
    }

    public List<Task> listTasks() {
        // Obtenho a lista
        return this.repository.read();
    }

    public Task listOneTask(Integer id) {
        // Obtenho uma tarefa específica
        List<Task> list = this.repository.read();
        for (Task task1 : list) {
            if (task1.getId().equals(id)) {
                return task1;
            }
        }
        return null;
    }

    public void updateTask(Integer id, Task task) {
        this.repository.update(id, task);
    }

    public void deleteTask(Integer id) {
        List<Task> list = this.repository.read();
        for (Task task3 : list) {
            if (task3.getId().equals(id)) {
                this.repository.delete(id);
            }
        }
    }
}
