package surveillance;

import surveillance.observable.Observateur;

public interface Observable {
    public void ajouterObservateur(Observateur observateur);
    public void supprimerObservateur(Observateur observateur);
}
