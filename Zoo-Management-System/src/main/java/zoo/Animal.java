package zoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void eat();
    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }

    @Override
    public String toString() {
        return species + " named " + name + " (" + age + " yrs)";
    }
}
