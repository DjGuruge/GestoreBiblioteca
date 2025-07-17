package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Pubblicazione> catalogo;
    private List<Utente> utenti;

    public Biblioteca(List<Pubblicazione> catalogo, List<Utente> utenti) {
        this.catalogo = new ArrayList<>();
        this.utenti = new ArrayList<>();
    }

    public List<Pubblicazione> getCatalogo() {
        return catalogo;
    }


    public List<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public void aggiungiPubblicazione(Pubblicazione pubblicazione) {
        catalogo.add(pubblicazione);
    }

    public void registraUtente(Utente utente) {
        utenti.add(utente);
    }

    //
//    public List<Pubblicazione> cercaPerTitolo(String titolo) {
//        return catalogo.stream()
//                .filter(p -> p.getTitolo().toLowerCase().contains(titolo.toLowerCase()))
//                .toList();
//
//
//
// oppure .collect(Collectors.toList()) per Java < 16
//    }
//
    public List<Pubblicazione> cercaPerTitolo(String titolo) {
        List<Pubblicazione> risultati = new ArrayList<>();
        for (Pubblicazione pubblicazione : catalogo) {
            if (pubblicazione.getTitolo().toLowerCase().contains(titolo.toLowerCase())) risultati.add(pubblicazione);
        }
        System.out.println("titolo non trovato");
        {
        }
        return risultati;
    }

    public void mostraCatalogoDisponibile() {
        for (Pubblicazione pubblicazione : catalogo) {
            if (pubblicazione.isDisponibile()) System.out.println(pubblicazione.getDescrizione());
        }
    }
    public void mostraNonDisponibili(){
        catalogo.stream()
                .filter(pubblicazione -> !pubblicazione.isDisponibile())
                .forEach(pubblicazione -> System.out.println(pubblicazione.getDescrizione()));
    }

    public void stampaTuttoIlCatalogo(){
        if (catalogo.isEmpty()){
            System.out.println("Il catalogo e' vuoto");
        return;
        }
        System.out.println("Lista completa catalogo biblioteca");
        catalogo.forEach(pubblicazione -> System.out.println(pubblicazione.getDescrizione()));
    }

}
