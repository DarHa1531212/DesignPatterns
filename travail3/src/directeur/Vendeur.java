package directeur;

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
    }
}
