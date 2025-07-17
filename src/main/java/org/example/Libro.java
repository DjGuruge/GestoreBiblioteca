package org.example;

public class Libro extends Pubblicazione {
    private String autore;
    private String genere;

    public Libro(String titolo, int annoPubblicazione, boolean disponibile, String autore, String genere) {
        super(titolo, annoPubblicazione, disponibile);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione()+" "+autore+" "+genere;
    }
}
