package org.example;

import org.example.Libro;
import org.example.Pubblicazione;
import org.example.Rivista;
import org.example.Utente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Bibbia",2002,true,"vari","religioso");
        Libro libro2 = new Libro("viaggio al centro della terra",2023,true,"Verneu","avventura");
        Libro libro3 = new Libro("Storia del calcio",2002,true,"vari","sportivo");
        Libro libro4 = new Libro("Seconda  guerrra",2002,true,"vari","storico");
        Libro libro5 = new Libro("Harry potter 1",2002,true,"Rowling","fantascienza");
        Libro libro6 = new Libro("Harry potter 2",2003,true,"Rowling","fantascienza");
        Libro libro7 = new Libro("Harry potter 3",2004,true,"Rowling","fantascienza");
        Rivista rivista1 = new Rivista("WinMagazine",2025,true,1,"Gennaio");
        Rivista rivista2 = new Rivista("WinMagazine",2025,true,2,"Febbraio");
        Rivista rivista3 = new Rivista("WinMagazine",2025,true,3,"Marzo");
        Rivista rivista4 = new Rivista("DonnaModerna",2025,true,1,"Gennaio");
        Rivista rivista5 = new Rivista("DonnaModerna",2025,true,2,"Febbraio");
        Rivista rivista6 = new Rivista("DonnaModerna",2025,true,3,"Marzo");
        Utente utente1 = new Utente("Mario", new ArrayList<Pubblicazione>());
        Utente utente2 = new Utente("Carlo", new ArrayList<Pubblicazione>());
        Utente utente3 = new Utente("Giovacchino", new ArrayList<Pubblicazione>());



        Biblioteca biblioteca = new Biblioteca(new ArrayList<>(),new ArrayList<>());
        biblioteca.aggiungiPubblicazione(libro1);
        biblioteca.aggiungiPubblicazione(libro2);
        biblioteca.aggiungiPubblicazione(libro3);
        biblioteca.aggiungiPubblicazione(libro4);
        biblioteca.aggiungiPubblicazione(libro5);
        biblioteca.aggiungiPubblicazione(libro6);
        biblioteca.aggiungiPubblicazione(libro7);
        biblioteca.aggiungiPubblicazione(rivista1);
        biblioteca.aggiungiPubblicazione(rivista2);
        biblioteca.aggiungiPubblicazione(rivista3);
        biblioteca.aggiungiPubblicazione(rivista4);
        biblioteca.aggiungiPubblicazione(rivista5);
        biblioteca.aggiungiPubblicazione(rivista6);
        biblioteca.registraUtente(utente1);
        biblioteca.registraUtente(utente2);
        biblioteca.registraUtente(utente3);


        utente1.prendiInPrestito(libro1);
        utente2.prendiInPrestito(libro3);
        utente3.prendiInPrestito(libro4);
        utente1.prendiInPrestito(rivista1);

        utente2.restituisci(libro3);

        biblioteca.mostraCatalogoDisponibile();

        System.out.println("NON DISPONIBILI A SEGUIRE");
        biblioteca.mostraNonDisponibili();

        List<Pubblicazione> lista = biblioteca.getCatalogo();



    }
}

