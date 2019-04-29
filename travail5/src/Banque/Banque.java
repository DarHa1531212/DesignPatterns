package Banque;

import java.util.HashMap;

public class Banque {
    private static Banque ourInstance = new Banque();

    private HashMap questions;
    public static Banque getInstance() {
        return ourInstance;
    }

    private Banque() {
        questions = new HashMap();
    }

    public Question getQuestion(char id)
    {
        return chargerQuestion(id);

    }

    private Question chargerQuestion (char id)
    {
        Question question = null;
        try{
            Class<Question> classeQuestion = (Class<Question>) Class.forName ("Banque.Question" + id);
            question = classeQuestion.newInstance();
            questions.put(id,question);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
return question;
    }
}
