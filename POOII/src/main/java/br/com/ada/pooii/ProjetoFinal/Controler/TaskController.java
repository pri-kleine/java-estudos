package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Controler;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository.TaskRepository;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service.TaskService;

import java.util.Scanner;

public class TaskController {
    //função da classe controller - imprime o menu, recebe input do usuário e passa a requisição para service;
    private final TaskService<Task> service = new TaskService<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        String menu = """
                ______ Menu Principal _____
                |0 - Sair                 |
                |1 - Listar tarefas       |
                |2 - Listar uma tarefa    |
                |3 - Atualizar uma tarefa |
                |4 - Apagar uma tarefa    |
                |5 - Criar uma tarefa     |
                '''''''''''''''''''''''''''
                """;
        String option = "";
        while (!option.equals("0")) {
            System.out.println(menu);
            System.out.println("Escolha uma opção acima: ");
            option = scanner.nextLine();
            switch (option) {
                case "0":
                    System.out.println("Sair do Menu");
                    break;
                case "1":
                    listTasks();
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    criarTasks();
                    break;
                default:
                    System.out.println("Falha");
            }
        }
    }

    private void listTasks() {
        System.out.println("Chamando o service pra listar as tarefas:");
        this.service.listTasks();
    }

    private void criarTasks() {
        System.out.println("Salvando uma tarefa. Qual o nome da tarefa?: ");
        String nome = scanner.nextLine();
        System.out.println("Qual o status da tarefa?: ");
        String status = scanner.nextLine();
        System.out.println("Qual a prioridade da tarefa?: ");
        Integer prioridade = scanner.nextInt();
        scanner.nextLine();
        this.service.salvarNovaTask(new Task(nome, status, prioridade));
    }
}


//    public static void main(String[] args) {
//
////        menu - listar , ler/buscar, atualizar, deleter, salvar;
//
////        Para salvar
//
////        System.out.println("Task type - 1. Standard, 2. Personal, 3. Study, 4. Work");
////        System.out.println("Please, enter what type of task you want to record: ");
////        int taskType = scanner.nextInt();
//
////        TaskService service;
////        Task task;
////
////        switch (taskType) {
////            case 1:
////                task = new Task();
////                TaskRepository <Task> repository = new TaskRepository<>();
////                service = new TaskService(repository);
////                break;
////            case 2:
////                PersonalTaskRepository personalTaskRepository = new PersonalTaskRepository();
////                service = new TaskService(personalTaskRepository);
////                break;
////            case 3:
////                StudyTaskRepository studyTaskRepository = new StudyTaskRepository();
////                service = new TaskService(studyTaskRepository);
////                break;
////            case 4:
////                WorkTaskRepository workTaskRepository = new WorkTaskRepository();
////                service = new TaskService(workTaskRepository);
////                break;
////            default:
////                service =  new TaskService(null);
////                System.out.println("Invalid choice.");
////                break;
////        }
////
////        service.salvarNovaTask(new Task());
//    }