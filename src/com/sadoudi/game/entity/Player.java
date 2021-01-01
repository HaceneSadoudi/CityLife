package com.sadoudi.game.entity;

import java.util.ArrayList;

public class Player {

    private String pseudo;
    private int nbrDiplomes = 0;
    private boolean permis;
    private ArrayList<Barre> barres;



    public Player() {
        barres = new ArrayList<Barre>();

    }

    public void ajouterPoints(int barre, int points) {
        barres.get(barre).setValue(barres.get(barre).getValue() + points);
    }
    public void enleverPoints(int barre, int points) {
        barres.get(barre).setValue(barres.get(barre).getValue() - points);

    }

    public void seDeplacer(Batiment batiment) {

    }

    public void manger() {

    }

    public void boire() {

    }

    public void seSoigner() {

    }

    public void tomberMalade() {

    }

    public void obtenirDiplome() {

    }
    public void mourire () {

    }


}
