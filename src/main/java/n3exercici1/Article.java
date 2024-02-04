package n3exercici1;

import n3exercici1.monedes.Moneda;

public class Article {

    private String nom;
    private double preu;
    private Moneda tipusMoneda;

    public Article (String nom, double preu, Moneda tipusMoneda){
        this.nom = nom;
        this.preu = preu;
        this.tipusMoneda = tipusMoneda;
    }

    public void setNom (String nom){
        this.nom = nom;
    }
    public void setPreu (double preu){
        this.preu = preu;
    }
    public void setTipusMoneda (Moneda tipusMoneda){
        this.tipusMoneda = tipusMoneda;
    }

    public void mostrarPreu (ConvertidorDeMoneda convertidor){
        System.out.println("El preu de l'article " + nom + " es de " + this.preu + " " +this.tipusMoneda.getTipusMoneda()
                + ", i la seva conversió a " + convertidor.getTipusMoneda() + " és de " + retornaCanviDivisa(convertidor) + "\n");
    }
    private double retornaCanviDivisa (ConvertidorDeMoneda convertidor) {
        return convertidor.canviarDivisa(this.tipusMoneda, this.preu);
    }

}
