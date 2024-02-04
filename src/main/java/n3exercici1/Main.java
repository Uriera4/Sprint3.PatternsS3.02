package n3exercici1;

import n3exercici1.monedes.*;

public class Main {
    public static void main(String[] args) {

        Moneda euro = new Euro();
        Moneda dolar = new Dolar();
        Moneda lliura = new Lliura();
        Moneda yen = new Yen();
        Moneda soles = new Soles();
        Moneda pesos = new Pesos();

        ConvertidorDeMoneda conversor = new ConvertidorDeMoneda(dolar);

        Article article = new Article("Bolígraf", 1.5, euro);

        article.mostrarPreu(conversor);
        conversor.setTipusMoneda(lliura);
        article.mostrarPreu(conversor);

        canviaArticle(article,"Llibreta", 5.99, dolar);
        article.mostrarPreu(conversor);
        conversor.setTipusMoneda(yen);
        article.mostrarPreu(conversor);

        canviaArticle(article, "Ordinador", 60000, soles);
        article.mostrarPreu(conversor);
        conversor.setTipusMoneda(pesos);
        article.mostrarPreu(conversor);

    }

    public static void canviaArticle(Article article, String nom, double preu, Moneda tipusMoneda){
        article.setNom(nom);
        article.setPreu(preu);
        article.setTipusMoneda(tipusMoneda);
    }

}