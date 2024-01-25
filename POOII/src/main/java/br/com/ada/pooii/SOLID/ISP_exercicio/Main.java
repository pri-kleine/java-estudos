package POOII.src.main.java.br.com.ada.pooii.SOLID.ISP_exercicio;

public class Main {
    public static void main(String[] args) {
        MultifunctionPrinter advanced = new AdvancedPrinter();
        MultifunctionPrinter economic = new EconomicPrinter();


        advanced.print();
        advanced.scan();
        economic.fax();
//        advanced.print();
//        advanced.print();


    }
}
