package zoo.app;

import zoo.model.*;

/**
 *
 * Class: Main
 *
 * Description:
 * This is the driver class for testing the Animal Hierarchy.
 * It demonstrates how abstract classes and inheritance work together in
 * an object-oriented design. Each animal object (Lion, Elephant, Penguin, Owl)
 * extends the abstract Animal class and overrides the method dailyPortionKg().
 *
 * This class also shows:
 *  - Creation of subclass objects using constructors.
 *  - Method overriding (each animal calculates food differently).
 *  - Method overloading (feed() and feed(food, portionKg)).
 *  - Polymorphism (calling the same method on different subclass objects).
 *
 * Output:
 * The program prints feeding activities and current animal status, verifying
 * that each subclass behaves according to its own implementation.
 *
 */
public class Main {

    public static void main(String[] args) {

        //  Object Creation (Inheritance Demo)
        Animal lion = new Lion("A001", "Leo", 200, 2);
        Animal elephant = new Elephant("A002", "Jumbo", 500, 3);
        Animal penguin = new Penguin("A003", "Pingu", 30, 2);
        Animal owl = new Owl("A004", "Hoot", 5, 1);

        //feeding Demonstration
        System.out.println("\n--- Feeding Time ---");
        lion.feed("meat");                 // default feed (overloaded version 1)
        elephant.feed("grass", 4.0);       // manual feed (overloaded version 2)
        penguin.feed("fish");
        owl.feed("mouse");

        //Display Animal Status
        System.out.println("\n--- Current Animal Status ---");
        lion.displayStatus();
        elephant.displayStatus();
        penguin.displayStatus();
        owl.displayStatus();

        //Explanation (Polymorphism Check)
        System.out.println("\n--- Polymorphism Demonstration ---");
        Animal[] zooAnimals = {lion, elephant, penguin, owl};
        for (Animal a : zooAnimals) {
            System.out.println(a.getName() + " needs " +
                    String.format("%.2f", a.dailyPortionKg()) +
                    " kg of food daily.");
        }
    }
}
