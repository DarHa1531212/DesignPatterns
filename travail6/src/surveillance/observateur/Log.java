package surveillance.observateur;

import surveillance.Evenement;
import surveillance.observable.EspionEvenement;
import surveillance.observable.Observateur;

public  class Log implements Observateur {
    private int NIVEAU_LOG;


    public Log(int NIVEAU_LOG)
    {
        NIVEAU_LOG = NIVEAU_LOG;
        EspionEvenement.getInstance().ajouterObservateur(this);

    }


    @Override
    public void alerter(Evenement evenement) {
        if (evenement.niveauUrgence > NIVEAU_LOG)
        {
            System.out.println(evenement.toString());
        }
    }
}
