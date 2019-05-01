package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;

import java.util.ArrayList;
import java.util.List;

public class EspionEvenement implements Observable {


    private List<Observateur> observateurs = new ArrayList<>();



    private static EspionEvenement ourInstance = new EspionEvenement();

    public static EspionEvenement getInstance() {
        return ourInstance;
    }

    private EspionEvenement() {
    }

    public void alerter (Evenement evenement)
    {
        for (Observateur observateur : observateurs) {
            observateur.alerter(evenement);
        }
    }

    @Override
    public void ajouterObservateur(Observateur _observateur) {
        observateurs.add(_observateur);


    }

    @Override
    public void supprimerObservateur(Observateur _observateur) {
        observateurs.remove(_observateur);

    }
}
