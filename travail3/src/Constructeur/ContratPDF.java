package Constructeur;

public class ContratPDF extends Contrat{
    public void ajouteDocument(String document)
    {
        documents.add(document);
    }

    public void imprime()
    {
        System.out.println("CONTRATS PFD:");
        for (String a : documents)
        {
            System.out.println("<PDF>" + a + "<PDF>");
        }

    }

}
