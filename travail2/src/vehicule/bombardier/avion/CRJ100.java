package vehicule.bombardier.avion;

import vehicule.Avion;

public class CRJ100 extends Avion {
    public CRJ100()
    {
        super(104,1650,0.835);
    }

    public void afficherPublicite()
    {
        System.out.println("CRJ100 pub");
    }
}
