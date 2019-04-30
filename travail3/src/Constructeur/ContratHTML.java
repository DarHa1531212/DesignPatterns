package Constructeur;

public class ContratHTML extends Contrat {

    public void ajouteDocument (String document)
    {
        documents.add(document);
    }

    public void imprime()
    {

        System.out.println("documents HTML:");
        for (String a : documents)
        {
            System.out.println("<HTML>" + a +"</HTML> ");
        }
    }
}
