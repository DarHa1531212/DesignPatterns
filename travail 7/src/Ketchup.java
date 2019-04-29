public class Ketchup extends MalboufeDecorateur {
    public Ketchup(Malbouffe malbouffe) {
        super(malbouffe);
    }

    public String getDescription()
    {
        return super.getDescription()+" avec du ketchup";    }
}
