package n2exercici1;

public class Paypal implements MetodeDePagament {

    private final String numeroPaypal;

    public Paypal(String numeroPaypal) {
        this.numeroPaypal = numeroPaypal;
    }

    @Override
    public String getMetodePagament() {
        return "paypal";
    }
    @Override
    public String pagamentNoEfectuat() {
        return "La compta de paypal no té fons suficients.";
    }

}
