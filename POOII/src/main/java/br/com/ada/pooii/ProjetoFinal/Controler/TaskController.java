package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Controler;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.Task;
import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Service.TaskService;

import java.util.List;
import java.util.Scanner;

public class TaskController {
    //função da classe controller - imprime o menu, recebe input do usuário e passa a requisição para service;
    private final TaskService service = new TaskService();
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
                    listOneTask();
                    break;
                case "3":
                    updateTask();
                    break;
                case "4":
                    deleteTask();
                    break;
                case "5":
                    createTasks();
                    break;
                default:
                    System.out.println("Falha");
            }
        }
    }

    private void createTasks() {
        System.out.print("Salvando uma tarefa. Qual o nome da tarefa?: ");
        String nome = scanner.nextLine();
        System.out.print("Qual o status da tarefa?: ");
        String status = scanner.nextLine();
        System.out.print("Qual a prioridade da tarefa?: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        this.service.salvarNovaTask(new Task(nome, status, id));
    }

    private void listTasks() {
        System.out.println("Listar todas as tarefas:");
        List<Task> list = this.service.listTasks();
        if (list.isEmpty()) System.out.println("Lista vazia");
        else System.out.println(list);
    }

    private void listOneTask() {
        System.out.println("Mostrar uma tarefa específica.");
        System.out.print("Qual tarefa você ver? Mencione o id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        Task task = this.service.listOneTask(id);
        if (task == null) {
            System.out.println("Tarefa não encontrada.");
        } else {
            System.out.println("Tarefa solicitada: " + task);
        }
    }

    private void updateTask() {
        System.out.println("Atualizar uma tarefa:");
        System.out.print("Qual tarefa você ver? Mencione o id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        Task task = this.service.listOneTask(id);
        if (task != null) {
            System.out.println("A seguinte task foi encontrada:");
            System.out.println(task);
            System.out.println("O que você quer atualizar? Digite 1 para nome, 2 para status, 3 para prioridade)");
            int updateOption = Integer.parseInt(scanner.nextLine());
            switch (updateOption) {
                case 1:
                    System.out.println("Digite o novo nome/descrição:");
                    String novoNome = scanner.nextLine();
                    task.setNome(novoNome);
                    this.service.updateTask(id, task);
                    System.out.println("Nome da tarefa atualizada com sucesso.");
                    System.out.println(task);
                    break;
                case 2:
                    System.out.println("Digite o novo status: ");
                    String novoStatus = scanner.nextLine();
                    task.setStatus(novoStatus);
                    this.service.updateTask(id, task);
                    System.out.println("Status da tarefa atualizada com sucesso.");
                    System.out.println(task);
                    break;
                case 3:
                    System.out.println("Digite a nova prioridade da tarefa:");
                    int novaPrioridade = Integer.parseInt(scanner.nextLine());
                    task.setPrioridade(novaPrioridade);
                    this.service.updateTask(id, task);
                    System.out.println("Prioridade da tarefa atualizada com sucesso.");
                    System.out.println(task);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        } else {
            System.out.println("Não há tarefa com este id informado.");
        }
    }

    private void deleteTask() {
        System.out.println("Deletar uma tarefa:");
        System.out.print("Qual tarefa você quer deletar? Mencione o id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        Task task = this.service.listOneTask(id);
        if (task != null) {
            System.out.println("A seguinte task foi encontrada:");
            System.out.println(task);
            System.out.println("Você tem certeza que quer deletar? Digite s para sim, n para não.");
            String deleteOption = scanner.nextLine();
            switch (deleteOption) {
                case "s":
                    this.service.deleteTask(id);
                    System.out.println("Tarefa deletada com sucesso.");
                    break;
                case "n":
                    System.out.println("Função deletar cancelada.");
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        } else {
            System.out.println("Não há tarefa com este id informado.");
        }
    }
}


//    public static void main(String[] args) {
//
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