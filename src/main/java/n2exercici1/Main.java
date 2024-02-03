package n2exercici1;



public class Main {
    public static void main(String[] args) {

        BotigaDeSabates botiga = new BotigaDeSabates();
        botiga.comprarSabates(new TarjaDeCredit("4766125421612320"));
        botiga.comprarSabates(new Paypal("mipaypal@gmail.com"));
        botiga.comprarSabates(new DeuteCompteBancari("ES21 2100 1420 00 1234567890 "));

    }
}