package zoo;

public class Reptile extends Animal {

    public Reptile(String name, int age) {
        super(name, age, "Reptile");
    }

    @Override
    public void eat() {
        System.out.println(name + " snaps up insects or small animals.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " hisses softly.");
    }
}
