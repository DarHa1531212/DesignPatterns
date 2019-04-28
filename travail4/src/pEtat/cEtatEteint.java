package pEtat;

public class cEtatEteint implements IEtat{
    @Override
    public IEtat EnvoyerCommande(int commande) {
        switch (commande)
        {
            case 0: return new cEtatDemarrage();

        }
        return null;
    }

    @Override
    public void AfficherInfo() {
        System.out.println("eteint");

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- demarre le PC \n 9 pour quitter \n votre choix:");
    }
}
