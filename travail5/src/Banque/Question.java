package Banque;

public class Question {
    private String desctiption;

    public Question(String _description)
    {
        desctiption = _description;

    }
    protected String getDescription()
    {
        return desctiption;
    }

    public String toString()
    {
        return getDescription();
    }
}
