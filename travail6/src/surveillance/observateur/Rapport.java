package surveillance.observateur;

import surveillance.Evenement;
import surveillance.observable.EspionEvenement;
import surveillance.observable.Observateur;

public class Rapport implements Observateur {

    public Rapport()
    {
        EspionEvenement.getInstance().ajouterObservateur(this);

    }
    public void alerter(Evenement evenement) {
        System.out.println(evenement.toString());
    }
}
