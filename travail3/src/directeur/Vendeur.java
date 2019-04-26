package directeur;

<<<<<<< HEAD
public class Vendeur {
    protected ConstucteurContrat constructeur;
    public void Vendeur(ConstructeurContrat constructeur)
    {
        constructeur = constructeur;

    }

    public Contrat construit(String nomClient)
    {


=======
import Constructeur.ConstructeurContrat;
import Constructeur.Contrat;

public class Vendeur {
    protected ConstructeurContrat constructeur;
    public Vendeur(ConstructeurContrat constructeur)
    {

    }

    public Contrat construit (String nomClient)
    {
        constructeur.construitBonDeCommande(nomClient);
        constructeur.construitDemandeImmatriculaiton(nomClient);
        return constructeur.resultat();
>>>>>>> 8bb9cfd3bd31ad17cbe32015a0628dda02a99efe
    }
}
