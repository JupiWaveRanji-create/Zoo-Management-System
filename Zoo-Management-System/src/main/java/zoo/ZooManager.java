package zoo;

import java.util.ArrayList;

public class ZooManager {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
        System.out.println(a.getName() + " added to zoo.");
    }

    public void feedAllAnimals() {
        System.out.println("\nFeeding time!");
        for (Animal a : animals) {
            a.eat();
        }
    }

    public void showAllAnimals() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
