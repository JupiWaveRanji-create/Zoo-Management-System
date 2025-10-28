package zoo;

/**
 * --------------------------------------------------------------------------
 * Class: Lion
 * --------------------------------------------------------------------------
 * Description:
 * This subclass represents a Lion in the zoo. It extends the Animal class
 * and overrides the abstract method dailyPortionKg() to provide its own
 * species-specific food formula.
 *
 * Formula:
 *     Daily food = 0.05 × body weight
 * Diet Type:
 *     CARNIVORE
 * --------------------------------------------------------------------------
 */
public class Lion extends Animal {

    public Lion(String id, String name, double weightKg, int mealsPerDay) {
        super(id, name, "Lion", weightKg, "CARNIVORE", mealsPerDay);
    }

    @Override
    public double dailyPortionKg() {
        return 0.05 * getWeightKg();
    }
}
