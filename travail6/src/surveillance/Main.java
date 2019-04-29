package surveillance;

import surveillance.observable.EspionEvenement;
import surveillance.observateur.GenerateurBuillet;
import surveillance.observateur.Log;
import surveillance.observateur.Rapport;
import surveillance.observateur.Support;

public class Main {
    public static void main(String[] args)
    {

        Log log = new Log (50);
        Rapport rapport = new Rapport();
        Support support = new Support();
        GenerateurBuillet generateurBuillet = new GenerateurBuillet();

        EspionEvenement a = EspionEvenement.getInstance();

        a.supprimerObservateur(log);
        a.supprimerObservateur(rapport);
        a.supprimerObservateur(support);
    }




}
