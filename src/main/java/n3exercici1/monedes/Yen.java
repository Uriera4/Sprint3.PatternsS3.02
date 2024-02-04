package n3exercici1.monedes;

public class Yen implements Moneda {

    private double valor = 159.58;

    @Override
    public String getTipusMoneda() {
        return "iens";
    }
    @Override
    public double getValorMoneda() {
        return valor;
    }
}
