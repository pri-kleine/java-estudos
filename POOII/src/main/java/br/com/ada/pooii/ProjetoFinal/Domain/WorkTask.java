package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain;

public class WorkTask extends Task{
    String projeto;

    public WorkTask(String nome, String status, Integer prioridade, String projeto) {
        super(nome, status, prioridade);
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "WorkTask{" +
                "projeto='" + projeto + '\'' +
                '}';
    }
}
