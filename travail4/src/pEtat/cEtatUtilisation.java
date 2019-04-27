package pEtat;

public class cEtatUtilisation implements IEtat{
    @Override
    public IEtat EnvoyerCommande(int commande) {
        return null;
    }

    @Override
    public void AfficherInfo() {

    }

    @Override
    public void AfficherCommande() {
        System.out.println("Les choix: \n 0- demarre le PC \n   1- fermer la session \n 2- fermer le pc \n  9 pour quitter \n votre choix:");

    }
}
