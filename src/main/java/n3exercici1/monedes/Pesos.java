package n3exercici1.monedes;

public class Pesos implements Moneda {

    private double valor = 892.0776;

    @Override
    public String getTipusMoneda() {
        return "pesos argentins";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
