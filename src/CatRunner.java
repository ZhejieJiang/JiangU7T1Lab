import java.util.ArrayList;
public class CatRunner {
    public static void main(String[]args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Felix");
        Cat cat3 = new Cat("Oscar");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Fluffy");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);
        cat4.setName("Fluffy Meow");
        System.out.println(cat4);
        System.out.println(cats);

        for(int i = 0; i<cats.size(); i++)
        {
            String replace = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(replace);
        }
        System.out.println(cats);

    }
}
