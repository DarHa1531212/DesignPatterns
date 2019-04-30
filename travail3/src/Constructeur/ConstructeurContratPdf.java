package Constructeur;

public class ConstructeurContratPdf  extends ConstructeurContrat{


    public ConstructeurContratPdf()
    {
        contrat = new ContratPDF();

    }

    public void construitBonDeCommande(String nomClient)
    {
        contrat.ajouteDocument("Demande d'immatriculation Demandeur: "+ nomClient);

    }

    @Override
    public void construitDemandeImmatriculaiton(String nomDemandeur) {
        contrat.ajouteDocument("Demande d'imatriculation: " + nomDemandeur);

    }




}
