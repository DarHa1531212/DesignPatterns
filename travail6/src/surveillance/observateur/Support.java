package surveillance.observateur;

import surveillance.Evenement;
import surveillance.observable.EspionEvenement;
import surveillance.observable.Observateur;

public class Support implements Observateur {

    public Support()
    {
        EspionEvenement.getInstance().ajouterObservateur(this);

    }


    public void alerter(Evenement evenement) {
        if (evenement.niveauUrgence > 90)
        {
            System.out.println(evenement.toString());
        }
    }
}
