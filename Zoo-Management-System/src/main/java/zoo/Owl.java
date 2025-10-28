package zoo;

/**
 *
 * Class: Owl
 *
 * Description:
 * This subclass represents an Owl. It extends the abstract Animal class
 * and overrides dailyPortionKg() with a nocturnal bird's diet formula.
 *
 * Formula:
 *     Daily food = 0.08 × body weight
 * Diet Type:
 *     CARNIVORE
 *
 */
public class Owl extends Animal {

    public Owl(String id, String name, double weightKg, int mealsPerDay) {
        super(id, name, "Owl", weightKg, "CARNIVORE", mealsPerDay);
    }

    @Override
    public double dailyPortionKg() {
        return 0.08 * getWeightKg();
    }
}
