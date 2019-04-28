package pEtat;

public class cEtatUtilisation implements IEtat{
    @Override
    public IEtat EnvoyerCommande(int commande) {
        switch (commande)
        {
            case 0: return new cEtatEteint();
            case 1: return new cEtatFermeture();
            case 2: return new cEtatEteint();
        }
        return null;
    }

    @Override
    public void AfficherInfo() {
        System.out.println("en utilisation");

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- demarre le PC \n   1- fermer la session \n 2- fermer le pc \n  9 pour quitter \n votre choix:");

    }
}
