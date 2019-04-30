public class Sauce extends MalboufeDecorateur {
    public Sauce(Malbouffe malbouffe) {
        super(malbouffe);
    }

    public String getDescription()
    {
        return super.getDescription()+" avec de la sauce";
    }
}
