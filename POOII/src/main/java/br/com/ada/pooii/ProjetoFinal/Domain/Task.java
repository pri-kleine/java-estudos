package POOII.src.main.java.br.com.ada.pooii.ProjetoFinal.Domain;

import java.util.ArrayList;

public class Task {
    String nome;
    String status;
    Integer prioridade;

    public Task(String nome, String status, Integer prioridade) {
        this.nome = nome;
        this.status = status;
        this.prioridade = prioridade;
    }

    public Task() {
        this("default", "new",999);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nome='" + nome + '\'' +
                ", status='" + status + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
