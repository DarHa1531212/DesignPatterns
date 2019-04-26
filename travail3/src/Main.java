<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
=======
import Constructeur.ConstructeurContrat;
import Constructeur.Contrat;
import directeur.Vendeur;

import java.util.Scanner;

public class Main{

    Scanner reader = new Scanner(System.in);
    ConstructeurContrat constructeurContrat;
    System.out.print("Voulez-vous construire des contrats HTML (1) ou PDF (2):");
    String choix = reader.next();

    if (choix.compareTo("1") == 0)
            constructeurContrat = new ConstructeurContratHtml();
    else
        constructeurContrat = new ConstructeurContratPdf();
    Vendeur vendeur = new Vendeur(constructeurContrat);

    Contrat contrat = vendeur.construit("Eric");
    contrat.imprime();

>>>>>>> 8bb9cfd3bd31ad17cbe32015a0628dda02a99efe
}
