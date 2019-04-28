package surveillance;

import surveillance.observable.EspionEvenement;
import surveillance.observateur.GenerateurBuillet;
import surveillance.observateur.Log;
import surveillance.observateur.Rapport;
import surveillance.observateur.Support;

public class Main {

    Log log = new Log (50);
    Rapport rapport = new Rapport();
    Support support = new Support();
    GenerateurBuillet generateurBuillet = new GenerateurBuillet();


    Thread.sleep(5000);

    EspionEvenement.getInstance().supprimerObservateur(log);



}
