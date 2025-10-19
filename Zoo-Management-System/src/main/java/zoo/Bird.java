package zoo;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age, "Bird");
    }

    @Override
    public void eat() {
        System.out.println(name + " pecks at seeds and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps melodiously.");
    }
}
