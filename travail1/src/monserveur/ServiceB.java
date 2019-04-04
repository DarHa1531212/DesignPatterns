package monserveur;

public abstract class ServiceB extends Service implements ServiceBInterface{

    public ServiceB() {
    }

    @Override
    public void methodeC() {
        MonServeur instance = MonServeur.getInstance();
instance.PublicPrint("C");
    }

    @Override
    public void methodeD() {
        MonServeur instance = MonServeur.getInstance();
instance.PublicPrint("D");

    }

    @Override
    public void methodeE() {
    ServiceInterfaceA instance = new ServiceA(){};
    instance.methodeA();
    }

    @Override
    public void methodeF() {
        ServiceA instance = new ServiceA() {
            public void methodeB() {
                super.methodeB();
            }
        };
        instance.methodeB();
    }
}
