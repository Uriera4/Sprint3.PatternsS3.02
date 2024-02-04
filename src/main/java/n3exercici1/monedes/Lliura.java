package n3exercici1.monedes;

public class Lliura implements Moneda {

    private double valor = 0.85;

    @Override
    public String getTipusMoneda() {
        return "lliures esterlines";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
