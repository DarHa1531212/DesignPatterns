package com.company;

import com.company.controleur.Acteur.BT7274;
import com.company.controleur.Acteur.Drone;
import com.company.controleur.Controleur;
import com.company.controleur.commande.CommandeEscive;
import com.company.controleur.commande.CommandeSaut;
import com.company.controleur.commande.CommandeTir;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) {

        Drone drone = new Drone();
        BT7274 bt = new BT7274();
        Controleur controleur = new Controleur(bt);

        System.out.println ("\nMODE DE JEU: NORMAL");

        System.out.println(controleur);

        controleur.jouer(Controleur.Bouton.X);
        controleur.jouer(Controleur.Bouton.Y);
        controleur.jouer(Controleur.Bouton.A);
        controleur.jouer(Controleur.Bouton.B);

        System.out.println ("\nMODE DE JEU: AVENTURE");

        controleur.setCommandes(Controleur.Bouton.Y);
        controleur.setCommandes(Controleur.Bouton.B, new CommandeSaut());

        System.out.println(controleur);

        controleur.jouer(Controleur.Bouton.X);
        controleur.jouer(Controleur.Bouton.Y);
        controleur.jouer(Controleur.Bouton.A);
        controleur.jouer(Controleur.Bouton.B);

        System.out.println ("\nMODE DE JEU: AVENTURE");

        controleur.setActeur(drone);
        controleur.reinitialiserCommanes();
        controleur.setCommandes(Controleur.Bouton.X, new CommandeEscive());
        controleur.setCommandes(Controleur.Bouton.B, new CommandeTir());

        System.out.println(controleur);

        controleur.jouer(Controleur.Bouton.X);
        controleur.jouer(Controleur.Bouton.Y);
        controleur.jouer(Controleur.Bouton.A);
        controleur.jouer(Controleur.Bouton.B);

    }
}
