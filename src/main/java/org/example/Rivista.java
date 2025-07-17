package org.example;

public class Rivista extends Pubblicazione {
    private int numero;
    private String periodicita;


    public Rivista(String titolo, int annoPubblicazione, boolean disponibile,int numero,String periodicita) {
        super(titolo, annoPubblicazione, disponibile);
        this.numero=numero;
        this.periodicita =periodicita;
    }

    public int getNumero() {
        return numero;
    }

    public String getPeriodicita() {
        return periodicita;
    }

    @Override
    public String getDescrizione(){
        return super.getDescrizione()+" "+numero+" "+periodicita;
    }
}
