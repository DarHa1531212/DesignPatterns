package Constructeur;

public class ConstructeurContratHtml extends ConstructeurContrat{
    public ConstructeurContratHtml()
    {
        contrat = new ContratHTML();

    }

    @Override
    public void construitBonDeCommande(String nomClient) {
        contrat.ajouteDocument("Bon de commande Clienr: " + nomClient);

    }

    @Override
    public void construitDemandeImmatriculaiton(String nomDemandeur) {
        contrat.ajouteDocument("Demande d'immatriculation Demandeur: "+ nomDemandeur);
    }
}
