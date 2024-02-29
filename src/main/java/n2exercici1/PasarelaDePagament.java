package n2exercici1;

import java.util.Random;

public class PasarelaDePagament {

    public void realitzaPagament(MetodeDePagament metode, String sabates){
        System.out.println((new Random().nextBoolean()) ?
                "Pagament amb " + metode.getMetodePagament() + " realitzat amb èxit. Has comprat unes " + sabates + "."
                : "Pagament no efectuat. " + metode.pagamentNoEfectuat());
    }

}
