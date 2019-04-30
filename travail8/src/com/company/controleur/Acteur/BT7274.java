package com.company.controleur.Acteur;

public class BT7274 implements Acteur {
    @Override
    public void sauter() {
        System.out.println("BT7274-Sauter");

    }

    @Override
    public void tirer() {
        System.out.println("BT7274-tirer");

    }

    @Override
    public void esciver() {
        System.out.println("BT7274-esciver");
    }

    @Override
    public void changerArme() {
        System.out.println("BT7274-changerArme");

    }
}
