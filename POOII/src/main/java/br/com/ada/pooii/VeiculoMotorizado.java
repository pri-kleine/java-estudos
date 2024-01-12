package POOII.src.main.java.br.com.ada.pooii;

    public interface VeiculoMotorizado extends Veiculo {

        void ligar();
        void desligar();

        Integer getVelocMaximaPermitida();
    }

