package zoo.model;

/**
 *
 * Class: Elephant
 *
 * Description:
 * This subclass represents an Elephant in the zoo. It inherits all common
 * properties from Animal and provides a specific implementation of
 * dailyPortionKg() based on the species formula.
 *
 * Formula:
 *     Daily food = 0.03 × body weight
 * Diet Type:
 *     HERBIVORE
 *
 */
public class Elephant extends Animal {

    public Elephant(String id, String name, double weightKg, int mealsPerDay) {
        super(id, name, "Elephant", weightKg, "HERBIVORE", mealsPerDay);
    }

    @Override
    public double dailyPortionKg() {
        return 0.03 * getWeightKg();
    }
}
