package POOII.src.main.java.br.com.ada.pooii;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Você ligou o Moto.");
    }

    @Override
    public void desligar() {
        System.out.println("Você desligou a Moto.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Você está acelerando a Moto.");
    }

    @Override
    public void frear() {
        System.out.println("Você freiou a Moto.");
    }
}
