package models.cartes;

import models.Joueur;

import java.util.ArrayList;

public abstract class Carte {
    private int cout;
    private ArrayList<TypeDeCarte> type;
    private LocalisationDesCartes Localisation;

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public ArrayList<TypeDeCarte> getType() {
        return type;
    }

    public void setType(ArrayList<TypeDeCarte> type) {
        this.type = type;
    }

    public LocalisationDesCartes getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(LocalisationDesCartes localisation) {
        Localisation = localisation;
    }

    public void effet(ArrayList<Joueur> joueurs){

    }
}
