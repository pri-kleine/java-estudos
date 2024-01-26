package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain;

public class StudyTask extends Task{
    String assunto;

    public StudyTask(String nome, String status, Integer prioridade) {
        super(nome, status, prioridade);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "StudyTask{" +
                "assunto='" + assunto + '\'' +
                '}';
    }
}
