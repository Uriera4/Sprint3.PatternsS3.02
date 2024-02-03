package n2exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BotigaDeSabates {

    private final PasarelaDePagament pasarela = new PasarelaDePagament();
    private final List<String> llistaSabates = new ArrayList<>();
    private String sabates;
    public BotigaDeSabates (){
        ompleLlistaSabates();
    }
    private void ompleLlistaSabates(){
        llistaSabates.add("sabates muntanya");
        llistaSabates.add("xancles");
        llistaSabates.add("botes de pluja");
        llistaSabates.add("sabates de vestir");
        llistaSabates.add("sabates de correr");
        llistaSabates.add("crocs");
    }

    public void comprarSabates(MetodeDePagament metode){
        Collections.shuffle(llistaSabates);
        sabates = llistaSabates.getFirst();
        pasarela.realitzaPagament(metode, sabates);
    }

}
