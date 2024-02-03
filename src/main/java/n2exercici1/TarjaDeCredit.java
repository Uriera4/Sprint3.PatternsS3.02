package n2exercici1;

public class TarjaDeCredit implements MetodeDePagament {

    private final String numeroTarja;

    public TarjaDeCredit(String numeroTarja) {
        this.numeroTarja = numeroTarja;
    }

    @Override
    public String getMetodePagament() {
        return "tarjeta de crèdit";
    }
    @Override
    public String pagamentNoEfectuat() {
        return "La tarjeta ha arribat al límit del seu crèdit.";
    }
}
