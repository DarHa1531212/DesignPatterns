package pEtat;

public class cEtatFermeture implements IEtat {
    @Override
    public IEtat EnvoyerCommande(int commande) {
        return null;
    }

    @Override
    public void AfficherInfo() {

    }

    @Override
    public void AfficherCommande() {
    System.out.println("System en cours d'éteinte");
    }
}
