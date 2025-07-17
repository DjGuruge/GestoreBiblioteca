package org.example;

public abstract class Pubblicazione {
    private String titolo;
    private int annoPubblicazione;
    private boolean disponibile;

    public Pubblicazione(String titolo, int annoPubblicazione, boolean disponibile) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = disponibile;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public String getDescrizione(){
        return titolo+" "+annoPubblicazione;
    }

    public void presta(){
        disponibile=false;
    }

    public void restituisci(){
        disponibile=true;
    }
}
