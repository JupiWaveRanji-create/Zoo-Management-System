package zoo;

public class Main {
    public static void main(String[] args) {

        // Create animal objects
        Mammal lion = new Mammal("Leo", 5);
        Bird parrot = new Bird("Polly", 2);
        Reptile snake = new Reptile("Sly", 3);

        // Display animal info
        System.out.println("\n--- Zoo Status ---");
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(snake);

        // Feeding time
        System.out.println("\n--- Feeding Time ---");
        lion.eat();
        parrot.eat();
        snake.eat();

        // Animal sounds
        System.out.println("\n--- Animal Sounds ---");
        lion.makeSound();
        parrot.makeSound();
        snake.makeSound();

        // Sleeping
        System.out.println("\n--- Night Time ---");
        lion.sleep();
        parrot.sleep();
        snake.sleep();
    }
}
