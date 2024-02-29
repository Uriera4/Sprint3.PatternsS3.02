package n3exercici1;

import n3exercici1.monedes.Moneda;

public class ConvertidorDeMoneda {

    private  Moneda tipusMoneda;

    public ConvertidorDeMoneda(Moneda tipusMoneda){
        this.tipusMoneda = tipusMoneda;
    }

    public void setTipusMoneda (Moneda tipusMoneda){
        this.tipusMoneda = tipusMoneda;
    }
    public String getTipusMoneda (){
        return this.tipusMoneda.getTipusMoneda();
    }

    public double canviarDivisa (Moneda monedaInicial, double quantitat){
        return (double) Math.round(quantitat * (this.tipusMoneda.getValorMoneda()) / (monedaInicial.getValorMoneda()) * 100) /100;
    }

}
