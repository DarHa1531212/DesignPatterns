package pEtat;

public class cEtatDemarrage implements IEtat
{
    @Override
    public IEtat EnvoyerCommande(int commande) {
        return null;
    }

    @Override
    public void AfficherInfo() {

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- eteindre le PC \n 1- CTRL+ALT+SUPPR \n 9 pour quitter \n votre choix:");

    }
}
