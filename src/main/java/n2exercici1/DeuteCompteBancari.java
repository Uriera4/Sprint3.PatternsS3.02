package n2exercici1;

public class DeuteCompteBancari implements MetodeDePagament{

    private final String numeroCompte;

    public DeuteCompteBancari(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    @Override
    public String getMetodePagament() {
        return "deute al compte bancari";
    }
    @Override
    public String pagamentNoEfectuat() {
        return "El compte bancari no té fons suficients.";
    }

}
