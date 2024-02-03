package n1exercici1.observers;

import n1exercici1.observable.AgentDeBorsa;

public class AgenciaDeBorsa {

    private AgentDeBorsa agentDeBorsa;
    private String ciutat;

    public AgenciaDeBorsa(AgentDeBorsa agentDeBorsa, String ciutat){
        this.agentDeBorsa = agentDeBorsa;
        this.ciutat = ciutat;
    }

    public void actualitzar(double estat) {
        System.out.println("--- Agencia de Borsa de " + ciutat + " ---");
        System.out.println((estat>0) ? "La Borsa ha pujat en un valor de " + estat + " punts."
                : (estat ==0) ? "La Borsa no ha variat de valor."
                : "La Borsa ha baixat en un valor de " + Math.abs(estat) + " punts.");
        System.out.println("Actualment el valor de la Borsa està en " + agentDeBorsa.getValorBorsa() + " punts.\n");
    }

}
