package pEtat;

public interface IEtat {
  IEtat EnvoyerCommande(int commande);
  void AfficherInfo();
  void AfficherCommande();

}
