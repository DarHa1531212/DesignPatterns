package surveillance.observateur;

import surveillance.Evenement;
import surveillance.observable.EspionEvenement;
import surveillance.observable.Observateur;

public  class GenerateurBillet implements Observateur {
     public GenerateurBillet()
     {
         EspionEvenement.getInstance().ajouterObservateur(this);

     }
    public void alerter(Evenement evenement) {
        System.out.println(evenement.toString());

    }
}
