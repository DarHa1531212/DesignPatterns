package pEtat;

public class cEtatAuthentication implements IEtat {
    @Override
    public IEtat EnvoyerCommande(int commande) {
        switch (commande)
        {
            case 0: return new cEtatEteint();
            case 1: return new cEtatFermeture();
            case 2: return new cEtatUtilisation();
        }
        return null;
    }

    @Override
    public void AfficherInfo() {
        System.out.println("en authentication");

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- eteindre le PC \n 1- fermer le PC  \n 2- Authenitfication \n 9 pour quitter \n votre choix:");

    }
}
