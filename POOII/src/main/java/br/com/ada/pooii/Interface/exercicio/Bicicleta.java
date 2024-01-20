package POOII.src.main.java.br.com.ada.pooii.Interface.exercicio;

public class Bicicleta implements Veiculo{

    private String nome;

    public Bicicleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Você está andando mais rápido com a bicicleta " + this.nome + ". Sua velocidade é: " + velocidade);
    }

    @Override
    public void frear() {
        System.out.println("Você freiando a bicicleta.");
    }
}
