package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Controler;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.TaskRepository;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service.TaskService;

import java.util.Scanner;
public class TaskController {
    public static void main(String[] args) {

//        menu - listar , ler/buscar, atualizar, deleter, salvar;


//        Para salvar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task type - 1. Standard, 2. Personal, 3. Study, 4. Work");
        System.out.println("Please, enter what type of task you want to record: ");
        int taskType = scanner.nextInt();

        TaskService service;
        Task task;

        switch (taskType) {
            case 1:
                task = new Task();
                TaskRepository repository = new TaskRepository();
                service = new TaskService(repository);
                break;
            case 2:
                PersonalTaskRepository personalTaskRepository = new PersonalTaskRepository();
                service = new TaskService(personalTaskRepository);
                break;
            case 3:
                StudyTaskRepository studyTaskRepository = new StudyTaskRepository();
                service = new TaskService(studyTaskRepository);
                break;
            case 4:
                WorkTaskRepository workTaskRepository = new WorkTaskRepository();
                service = new TaskService(workTaskRepository);
                break;
            default:
                service =  new TaskService(null);
                System.out.println("Invalid choice.");
                break;
        }

        service.salvarNovaTask(new Task());

    }
}
