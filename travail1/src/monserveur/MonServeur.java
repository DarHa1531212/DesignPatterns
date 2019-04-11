package monserveur;

public class MonServeur {

private static MonServeur single_instance = null;
    MonServeur()
    {
      ServiceA monServiceA = new ServiceA() {
          @Override
          public void methodeA() {
              super.methodeA();
          }
      };
      ServiceB monServiceB = new ServiceB() {
          @Override
          public void methodeC() {
              super.methodeC();
          }
      };

    }

    public static MonServeur getInstance()
    {
        if (single_instance == null)
            single_instance = new MonServeur();

        return single_instance;

    }

    void defaultPrint(String m)
    {
        System.out.println("defaultPrint" + m);

    }

    public void PublicPrint(String m )
    {

        System.out.println("publicPrint" + m);
    }

    public ServiceInterfaceA GetServiceAInterface()
    {

        ServiceInterfaceA instance;
        instance = new ServiceA() { };
        return instance;
    }

    public ServiceBInterface GetServiceBInterface()
    {

        ServiceBInterface instance;
        instance = new ServiceB() {};
        return instance;

    }

    private ServiceA GetServiceA()
    {

        ServiceA instance;
        instance = new ServiceA() { };
        return instance;

    }
}
