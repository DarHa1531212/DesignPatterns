package pEtat;

public class cEtatDemarrage implements IEtat
{
    @Override
    public IEtat EnvoyerCommande(int commande) {
        switch (commande)
        {
            case 0: return new cEtatEteint();
            case 1: return new cEtatAuthentication();

        }
        return null;
    }

    @Override
    public void AfficherInfo() {
        System.out.println("en demarrage");

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- eteindre le PC \n 1- CTRL+ALT+SUPPR \n 9 pour quitter \n votre choix:");

    }
}
