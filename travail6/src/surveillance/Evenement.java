package surveillance;

public class Evenement {

    public int niveauUrgence;
    public String description;

    public Evenement(int _niveauUrgence, String __description)
    {
        super();
        niveauUrgence = _niveauUrgence;
        description = __description;

    }

    public String toString()
    {
        return "Evenement\n {niveauUrgence: " + niveauUrgence + " Description:" + description + "}";
    }
}
