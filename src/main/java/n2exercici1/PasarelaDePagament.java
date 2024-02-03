package n2exercici1;

import java.util.Random;

public class PasarelaDePagament {
    private boolean pagat;
    private final Random r = new Random();

    public void realitzaPagament(MetodeDePagament metode, String sabates){
        this.pagat = r.nextBoolean();
        System.out.println(pagat ? "Pagament amb " + metode.getMetodePagament() + " realitzat amb èxit. Has comprat unes " + sabates + "."
                : "Pagament no efectuat. " + metode.pagamentNoEfectuat());
    }

}
