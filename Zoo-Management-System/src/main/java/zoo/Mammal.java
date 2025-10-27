package zoo;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age, "Mammal");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats plants or meat depending on species.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " growls or roars.");
    }
}
