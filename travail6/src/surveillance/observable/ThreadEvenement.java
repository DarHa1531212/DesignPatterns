package surveillance.observable;

import surveillance.Evenement;

public class ThreadEvenement {

    private EspionEvenement espion;
    public ThreadEvenement(EspionEvenement _espion)
    {
        espion = _espion;

    }

 public void run()
 {
     for (int i = 0; i < 10; i++ )

     {

        String[] descriptionsEvenement  = new String[]{
                 "Feu","Fuite Eau", "Panne de courrant", "greve","bris majeur"
        };

         try
         {
             Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
             // this part is executed when an exception (in this example InterruptedException) occurs
         }
            Evenement evenement = new Evenement((int) (Math.random()*1000), descriptionsEvenement[(int) (Math.random()) * descriptionsEvenement.length]);
        espion.alerter(evenement);
     }

 }
}
