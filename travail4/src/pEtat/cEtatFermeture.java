package pEtat;

public class cEtatFermeture implements IEtat {
    @Override
    public IEtat EnvoyerCommande(int commande) {
        return null;
    }

    @Override
    public void AfficherInfo() {
        System.out.println("en fermeture");

    }

    @Override
    public void AfficherCommande() {
    System.out.println("0- login\n 1- shutdown");
    }
}
