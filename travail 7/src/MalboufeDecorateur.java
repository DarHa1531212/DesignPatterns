public class MalboufeDecorateur implements Malbouffe {

    private Malbouffe malbouffe;
    public MalboufeDecorateur (Malbouffe malbouffe)
    {
        malbouffe = malbouffe;

    }

    public String getDescription()
    {
        return "malbouffe decorateur";
    }
}
