public class MalboufeDecorateur implements Malbouffe {

    private Malbouffe malbouffe;
    public MalboufeDecorateur (Malbouffe _malbouffe)
    {
        malbouffe = _malbouffe;

    }

    public String getDescription()
    {
        return malbouffe.getDescription();
    }
}
