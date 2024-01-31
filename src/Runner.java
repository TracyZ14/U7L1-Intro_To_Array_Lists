import java.util.ArrayList;
public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        Cat cat1 = new Cat("Tails");
        catArrayList.add(cat1);
        Cat cat2 = new Cat("Two");
        Cat cat3 = new Cat("Three");
        Cat cat4 = new Cat("Four");
        catArrayList.add(cat2);
        catArrayList.add(cat3);
        catArrayList.add(cat4);
        Cat newCat = new Cat("New Cat");
        catArrayList.set(2, newCat);
        System.out.println(catArrayList);

        catArrayList.get(1).setName("Archie");
        System.out.println(catArrayList);

        /*
        ArrayList dogList = new ArrayList();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
        */

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}