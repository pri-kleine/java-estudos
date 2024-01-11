package POOII.src.main.java.br.com.ada.pooii;

public class Bibicleta implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Você começou a andar de bicicleta.");
    }

    @Override
    public void desligar() {
        System.out.println("Você parou a andar de bicicleta.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Você está andando mais rápido com a bicicleta.");
    }

    @Override
    public void frear() {
        System.out.println("Você freiando a bicicleta.");
    }
}
