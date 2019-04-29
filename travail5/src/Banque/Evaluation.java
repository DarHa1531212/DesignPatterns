package Banque;

public class Evaluation {

    private int noEvaluation;
    private Question q1,q2;

    public Evaluation(int noEvaluation, char idQ1, char idQ2)
    {
        noEvaluation = noEvaluation;
        q1 = Banque.getInstance().getQuestion(idQ1);
        q2 = Banque.getInstance().getQuestion(idQ2);

    }

    public String toString()
    {
        return noEvaluation + " evaluation: " + q1 + " " + q2;
    }
}
