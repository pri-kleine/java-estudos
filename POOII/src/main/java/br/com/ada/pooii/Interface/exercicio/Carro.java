package POOII.src.main.java.br.com.ada.pooii.Interface.exercicio;

public class Carro implements VeiculoMotorizado{

    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar() {
        System.out.println("Você ligou o Carro " + this.nome);
    }

    @Override
    public void desligar() {
        System.out.println("Você desligou o Carro " + this.nome);
    }

    @Override
    public void acelerar(int velocidade) {
        if (velocidade > 0) {
            if (velocidade < getVelocMaximaPermitida()) {
                System.out.println("Você está acelerando o Carro " + this.nome + ". Sua velocidade é: " + velocidade);
            } else {
                System.out.println("Você está acima da velocidade máxima permitida. Por favor, reduza a velocidade imediatamente.");
            }
        }
    }

    @Override
    public void frear() {
        System.out.println("Você freiou o Carro " + this.nome);
    }

    public Integer getVelocMaximaPermitida() {
        return 230;
    }
}
