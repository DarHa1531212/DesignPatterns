package Constructeur;

public class ContratPDF extends Contrat{
    public void ajouteDocument(String document)
    {
        documents.add(document);
    }

    public void imprime()
    {
        for (String a : documents)
        {
            System.out.println(a);
        }

    }

}
