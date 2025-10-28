package zoo;

/**
 * --------------------------------------------------------------------------
 * Class: Penguin
 * --------------------------------------------------------------------------
 * Description:
 * This subclass models a Penguin. It implements its own formula for
 * computing daily food requirement, demonstrating method overriding.
 *
 * Formula:
 *     Daily food = 0.06 × body weight
 * Diet Type:
 *     OMNIVORE
 * --------------------------------------------------------------------------
 */
public class Penguin extends Animal {

    public Penguin(String id, String name, double weightKg, int mealsPerDay) {
        super(id, name, "Penguin", weightKg, "OMNIVORE", mealsPerDay);
    }

    @Override
    public double dailyPortionKg() {
        return 0.06 * getWeightKg();
    }
}
