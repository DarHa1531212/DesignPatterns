package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;

import java.util.List;

public class EspionEvenement implements Observable{
    private static List<Observateur> observateurs;
    private Observable observable;

    private static EspionEvenement ourInstance = new EspionEvenement() {

    };

    public static EspionEvenement getInstance() {
        return ourInstance;
    }

    private EspionEvenement() {
    }

    public void alerter (Evenement evenement)
    {


    }

    public void supprimerObservateur(Observateur observateur) {

    }

    public void ajouterObservateur(Observateur observateur)    {

    }

}
