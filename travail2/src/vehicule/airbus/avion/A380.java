package vehicule.airbus.avion;

import vehicule.Avion;

public  class A380 extends Avion {


    public A380() {
        super(853, 15200, 0.93);
    }

    public void afficherPublicite()
    {
        System.out.println("A380 pub");

    }
}
