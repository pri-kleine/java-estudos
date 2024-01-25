package POOII.src.main.java.br.com.ada.pooii.SOLID.ISP_exercicio;

public class AdvancedPrinter implements MultifunctionPrinter {
    @Override
    public void print() {
        System.out.println("Advanced print");
    }

    @Override
    public void scan() {
        System.out.println("Advanced scan");
    }

    @Override
    public void fax() {
        System.out.println("Advanced fax");
    }

    @Override
    public void copy() {
        System.out.println("Advanced copy");
    }
}
