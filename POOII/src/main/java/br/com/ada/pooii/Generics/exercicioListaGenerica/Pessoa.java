package POOII.src.main.java.br.com.ada.pooii.Generics.exercicioListaGenerica;

public record Pessoa(long id, String nome) implements RegistroID <Long>{
    @Override
    public Long getId() {
        return id;
    }
}
