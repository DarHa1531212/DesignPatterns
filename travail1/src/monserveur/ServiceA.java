package monserveur;
import monserveur.MonServeur;
public abstract class ServiceA extends Service implements ServiceInterfaceA  {
    public ServiceA()
    {


    }

    @Override
    public void methodeA() {

       MonServeur instance = MonServeur.getInstance();
       instance.defaultPrint("A");

    }

    public void methodeB()
    {
        MonServeur instance = MonServeur.getInstance();
instance.PublicPrint("B");
    }
}
