package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Repository;

import POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain.PersonalTask;

public class PersonalTaskRepository implements RepositoryInterface<PersonalTask> {
    @Override
    public void salvar(PersonalTask personalTask) {
        System.out.println("Salvando tarefa");
    }
}
