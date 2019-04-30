import monserveur.MonServeur;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nom: Hans Darmstadt-Bélanger\n projet: Singleton");
        MonServeur.getInstance().PublicPrint("main");
        MonServeur.getInstance().GetServiceAInterface().methodeA();
        MonServeur.getInstance().GetServiceBInterface().methodeC();
        MonServeur.getInstance().GetServiceBInterface().methodeD();
        MonServeur.getInstance().GetServiceBInterface().methodeE();
        MonServeur.getInstance().GetServiceBInterface().methodeF();
    }
}
