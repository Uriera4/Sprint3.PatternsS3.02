package n1exercici1.observable;

import n1exercici1.observers.AgenciaDeBorsa;

import java.util.ArrayList;
import java.util.List;

public class AgentDeBorsa implements Notificador{

    protected List<AgenciaDeBorsa> llistaAgenciesBorsa = new ArrayList<>();
    private double valorBorsa;
    private double estat;

    public void setValorBorsa(double valor){
        this.estat = valor-this.valorBorsa;
        this.valorBorsa = valor;
        notificaCanvisBorsa(this.estat);
    }
    public double getValorBorsa (){
        return valorBorsa;
    }

    @Override
    public void afegirAgenciaBorsa (AgenciaDeBorsa agencia){
        llistaAgenciesBorsa.add(agencia);
    }
    @Override
    public void eliminarAgenciaBorsa(AgenciaDeBorsa agencia) {
        llistaAgenciesBorsa.remove(agencia);
    }
    @Override
    public void notificaCanvisBorsa(double estat) {
        llistaAgenciesBorsa.forEach(agencia -> agencia.actualitzar(estat));
    }

}
