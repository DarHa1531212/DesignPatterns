import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Malbouffe> malbouffes = new ArrayList<>();

        McDo mcDo = new McDo();
        hotDog HotDog = new hotDog();
        Poutine poutine = new Poutine();

        malbouffes.add(mcDo);
        malbouffes.add(HotDog);
        malbouffes.add(poutine);

        malbouffes.add(new Sauce(poutine));
        malbouffes.add(new Sauce(mcDo));

        malbouffes.add(new Ketchup(poutine));
        malbouffes.add(new Ketchup(mcDo));

        for (Malbouffe malbouffe: malbouffes) {
            System.out.println(malbouffe.getDescription());
        }
    }
}
