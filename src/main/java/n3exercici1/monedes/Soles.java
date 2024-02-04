package n3exercici1.monedes;

public class Soles implements Moneda {

    private double valor = 4.1115;

    @Override
    public String getTipusMoneda() {
        return "soles";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
