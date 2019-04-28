package surveillance.observable;

import surveillance.Evenement;

public interface Observateur {

    public void alerter(Evenement evenement);
}
