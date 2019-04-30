package Constructeur;

import java.util.ArrayList;
import java.util.List;

public abstract class Contrat {
    protected List<String > documents;

    public Contrat()
    {
        documents = new ArrayList<>();


    }

    public abstract void ajouteDocument (String document);

    public abstract void imprime();
}
