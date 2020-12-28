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
        
    }
}
