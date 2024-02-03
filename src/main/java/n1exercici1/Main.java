package n1exercici1;

import n1exercici1.observable.AgentDeBorsa;
import n1exercici1.observers.AgenciaDeBorsa;

public class Main {
    public static void main(String[] args) {
        AgentDeBorsa agent = new AgentDeBorsa();

        AgenciaDeBorsa agencia1 = new AgenciaDeBorsa(agent, "Madrid");
        AgenciaDeBorsa agencia2 = new AgenciaDeBorsa(agent, "Barcelona");
        AgenciaDeBorsa agencia3 = new AgenciaDeBorsa(agent, "Bilbao");

        agent.afegirAgenciaBorsa(agencia1);
        agent.afegirAgenciaBorsa(agencia2);
        agent.afegirAgenciaBorsa(agencia3);

        agent.setValorBorsa(100);
        agent.setValorBorsa(60);
        agent.setValorBorsa(60);
        agent.setValorBorsa(200);

    }
}