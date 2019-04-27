import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        cSystemeExploitation se = new cSystemeExploitation();

        int choix = 0;
        do {
            se.AfficherInfo();
            se.AfficherCommande();
            choix = getChoix(sc);
            se.EnvoyerCommande(choix);

        }
        while (choix != 9);
    }

    private static int getChoix(Scanner sc)
    {
        System.out.print("\nVotre Choix (9 pour quitter): ");
        return sc.nextInt();

    }
}
