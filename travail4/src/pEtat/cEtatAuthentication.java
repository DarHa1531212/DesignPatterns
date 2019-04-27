package pEtat;

public class cEtatAuthentication implements IEtat {
    @Override
    public IEtat EnvoyerCommande(int commande) {
        return null;
    }

    @Override
    public void AfficherInfo() {

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- eteindre le PC \n 1- fermer le PC  \n 2- Authenitfication \n 9 pour quitter \n votre choix:");

    }
}
