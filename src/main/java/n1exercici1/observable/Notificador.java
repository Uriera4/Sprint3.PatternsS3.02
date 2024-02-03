package n1exercici1.observable;

import n1exercici1.observers.AgenciaDeBorsa;

public interface Notificador {

    void afegirAgenciaBorsa(AgenciaDeBorsa agencia);
    void eliminarAgenciaBorsa(AgenciaDeBorsa agencia);
    void notificaCanvisBorsa(double estat);

}
