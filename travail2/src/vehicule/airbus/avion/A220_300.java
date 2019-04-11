package vehicule.airbus.avion;

import vehicule.Avion;


public class A220_300 extends Avion {


    public A220_300() {
        super(160, 6112, 0.82);
    }

    @Override
    public void afficherPublicite() {
    System.out.println("A220_300 pub");
    }
}
