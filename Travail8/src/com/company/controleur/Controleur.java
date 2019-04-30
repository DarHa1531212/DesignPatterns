package com.company.controleur;

import com.company.controleur.Acteur.Acteur;
import com.company.controleur.commande.*;

public class Controleur {
    private Commande[] commandes;
    private Acteur acteur;

    public Controleur(Acteur acteur_ )
    {
        acteur = acteur_;
        reinitialiserCommanes();
    }

    public void reinitialiserCommanes()
    {
        commandes[0] = new CommandeSaut();
        commandes[1] = new CommandeTir();
        commandes[2] = new CommandeEscive();
        commandes[3] = new commandeChangementarme();

    }

    public void setCommandes(Bouton bouton, Commande commande)
    {


    }

    public void setCommandes(Bouton bouton)
    {
        switch (bouton)
        {
            case A: commandes[2] = null;
            break;
            case B: commandes[3] = null;
            break;
            case X:commandes[0] = null;
            break;
            case Y: commandes[1] = null;
            break;

        }

    }

    public void jouer(Bouton bouton)
    {
        //appelle la méthode executer de la commande
        switch (bouton) {
            case A:
                if (commandes[2] != null)
                    new CommandeEscive().executer();
                break;
            case B:
                if (commandes[3] != null)
                    new commandeChangementarme().executer();
                break;
            case X:
                if (commandes[0] != null)
                    new CommandeSaut().executer();
                break;
            case Y:
                if (commandes[1] != null)
                    new CommandeTir().executer();
                break;
        }
    }

    public String toString()
    {
        return null;
    }
}
