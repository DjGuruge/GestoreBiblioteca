package org.example;

import java.util.ArrayList;
import java.util.List;

public class Utente {
    private String nome;
    private List<Pubblicazione> prestiti;


    public Utente(String nome, List<Pubblicazione> prestiti) {
        this.nome = nome;
        this.prestiti = new ArrayList<Pubblicazione>(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pubblicazione> getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(List<Pubblicazione> prestiti) {
        this.prestiti = prestiti;
    }

    public void prendiInPrestito(Pubblicazione pubblicazione){
        if (pubblicazione.isDisponibile()){
            prestiti.add(pubblicazione);
            pubblicazione.presta();
        }
    }

    public void restituisci(Pubblicazione pubblicazione){
        prestiti.remove(pubblicazione);
        pubblicazione.restituisci();
    }


}
