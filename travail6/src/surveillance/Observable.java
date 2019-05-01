package surveillance;

import surveillance.observable.Observateur;

public interface Observable {
    public void ajouterObservateur(Observateur _observateur);
    public void supprimerObservateur(Observateur _observateur);
}
