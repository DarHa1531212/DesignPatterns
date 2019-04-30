import Banque.Evaluation;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nom: Hans Darmstadt-Bélanger\nPoids Mouche");

        final int NB_ETUDNANTS = 149;
        ArrayList<Evaluation> mesEvaluationsAndroid = new ArrayList<Evaluation>();

        for (int x = 1; x <= NB_ETUDNANTS; x++)
        {
            mesEvaluationsAndroid.add(new Evaluation(x, genererIdQUestion(), genererIdQUestion()));

        }

        for (Evaluation evaluation : mesEvaluationsAndroid)
        {
            System.out.println(evaluation);
        }
    }

    private static char genererIdQUestion()
    {
        return (char) (ThreadLocalRandom.current().nextInt(65, 68));
    }
}
