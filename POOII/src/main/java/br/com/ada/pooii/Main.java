package POOII.src.main.java.br.com.ada.pooii;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



    Carro jepp = new Carro("Jepp");
    jepp.ligar();
    jepp.desligar();
    jepp.acelerar(300);
    jepp.frear();

    Moto titan = new Moto("Titan");
    titan.ligar();
    titan.desligar();
    titan.acelerar(80);


    Bicicleta sense = new Bicicleta("Sense");
    sense.acelerar(40);
    sense.frear();


    }
}