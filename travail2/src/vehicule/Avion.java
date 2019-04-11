package vehicule;

public abstract class Avion implements Vehicule {
    private int passagerMax;
    private double vitesseCroisiereMax;
    private int distanceFranchissable;



    public  Avion(int nbrepassagerMax, int DistanceFranchissable, double vitesseCroisiereMaximale)
    {
        passagerMax = nbrepassagerMax;
        vitesseCroisiereMax = vitesseCroisiereMaximale;
        distanceFranchissable = DistanceFranchissable;

    }
    public void afficherCaracteristiques()
    {
        System.out.println("Passagers max:" + passagerMax + " distance franchissable: " + distanceFranchissable + " vitesse croisiere max: " + vitesseCroisiereMax);

    }
}
