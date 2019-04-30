package com.company.controleur.Acteur;

public class Drone implements Acteur {
    @Override
    public void sauter() {
        System.out.println("Drone-sauter");

    }

    @Override
    public void tirer() {
        System.out.println("Drone-Tirer");
    }

    @Override
    public void esciver() {
        System.out.println("Drone-esciver");

    }

    @Override
    public void changerArme() {
        System.out.println("Drone-changerArme");

    }
}
