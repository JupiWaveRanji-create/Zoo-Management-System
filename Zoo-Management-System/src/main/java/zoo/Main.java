package zoo;

public class Main {
    public static void main(String[] args) {
        ZooManager manager = new ZooManager();

        Mammal lion = new Mammal("Leo", 5);
        Bird parrot = new Bird("Polly", 2);
        Reptile snake = new Reptile("Sly", 3);

        manager.addAnimal(lion);
        manager.addAnimal(parrot);
        manager.addAnimal(snake);

        System.out.println("\n--- Zoo Status ---");
        manager.showAllAnimals();

        System.out.println("\n--- Feeding Time ---");
        manager.feedAllAnimals();

        System.out.println("\n--- Animal Sounds ---");
        lion.makeSound();
        parrot.makeSound();
        snake.makeSound();
    }
}
