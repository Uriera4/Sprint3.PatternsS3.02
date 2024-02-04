package n3exercici1.monedes;

public class Euro implements Moneda{

    private double valor = 1;

    @Override
    public String getTipusMoneda() {
        return "euros";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
