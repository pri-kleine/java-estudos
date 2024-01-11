package POOII.src.main.java.br.com.ada.pooii;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Você ligou o Carro.");
    }

    @Override
    public void desligar() {
        System.out.println("Você desligou o Carro.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Você acelerou o Carro.");
    }

    @Override
    public void frear() {
        System.out.println("Você freiou o Carro.");
    }
}
