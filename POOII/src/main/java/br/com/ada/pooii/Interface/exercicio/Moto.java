package POOII.src.main.java.br.com.ada.pooii.Interface.exercicio;

public class Moto implements VeiculoMotorizado{

    private String nome;

    public Moto(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar() {
        System.out.println("Você ligou a Moto " + this.nome);
    }

    @Override
    public void desligar() {
        System.out.println("Você desligou a Moto.");
    }



    @Override
    public void acelerar(int velocidade) {
        if (velocidade > 0){
            if(velocidade < getVelocMaximaPermitida()){
                System.out.println("Você está acelerando a Moto. Sua velocidade é: " + velocidade);
            } else{
                System.out.println("Você está acima da velocidade máxima permitida. Por favor, reduza a velocidade imediatamente.");
            }
        }
    }

    @Override
    public void frear() {
        System.out.println("Você freiou a Moto.");
    }

    @Override
    public Integer getVelocMaximaPermitida() {
        return 150;
    }
}
