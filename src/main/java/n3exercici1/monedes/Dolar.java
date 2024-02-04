package n3exercici1.monedes;

public class Dolar implements Moneda {

    private double valor = 1.08;

    @Override
    public String getTipusMoneda() {
        return "dolars";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
