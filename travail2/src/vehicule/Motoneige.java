package vehicule;

public  class Motoneige implements Vehicule {
    private int longeurChenille;
    private int PDSF;

    public Motoneige(int LongeurChenille, int pDSF)
    {
        longeurChenille = LongeurChenille;
        PDSF = pDSF;

    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("longeur chenilles: " + longeurChenille + " PDSF: " + PDSF );
    }

    @Override
    public void afficherPublicite() {

    }
}
