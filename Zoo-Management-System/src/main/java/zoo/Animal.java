package zoo;

/**
 *
 * Abstract Class: Animal
 *
 * Description:
 * This abstract class represents the general blueprint for all animals
 * maintained in the Zoo Management System. It defines the key attributes
 * (identity, species, diet, and feeding details) and the shared behaviours
 * such as feeding and status display.
 *
 * Rationale:
 * Each species has its own rule for calculating daily food requirements.
 * Therefore, the method dailyPortionKg() is declared as abstract so that
 * each subclass (Lion, Elephant, Penguin, Owl) can implement its specific
 * formula. This approach demonstrates the use of abstraction.
 *
 * Demonstrated OOP Principles:
 * - Encapsulation: all attributes are private with public getters.
 * - Inheritance: all specific animals inherit from this base class.
 * - Abstraction: dailyPortionKg() is abstract and implemented differently
 *   in each subclass.
 * - Polymorphism: feed() and displayStatus() behave appropriately based on
 *   the subclass object.
 *
 */
public abstract class Animal {

    //Core Attributes
    private final String animalID;
    private final String name;
    private final String species;
    private final double weightKg;
    private final String dietProfile;
    private final int requiredMealsPerDay;
    private int mealsFedToday = 0;

    /**
     * Constructor:
     * Creates an Animal object with validation of key input values.
     * This ensures that only valid data is accepted by the program.
     */
    public Animal(String animalID,
                  String name,
                  String species,
                  double weightKg,
                  String dietProfile,
                  int requiredMealsPerDay) {

        if (animalID == null || animalID.isBlank())
            throw new IllegalArgumentException("animalID required");
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("name required");
        if (species == null || species.isBlank())
            throw new IllegalArgumentException("species required");
        if (weightKg <= 0)
            throw new IllegalArgumentException("weightKg > 0 required");
        if (requiredMealsPerDay < 1)
            throw new IllegalArgumentException("meals/day >= 1 required");

        this.animalID = animalID;
        this.name = name;
        this.species = species;
        this.weightKg = weightKg;
        this.dietProfile = dietProfile;
        this.requiredMealsPerDay = requiredMealsPerDay;
    }

    //Abstract Method
    /**
     * Abstract method that must be implemented by each subclass.
     * Calculates the total amount of food (in kilograms) required per day.
     */
    public abstract double dailyPortionKg();

    // Feeding Methods
    /**
     * Default feeding method that divides the total daily portion evenly
     * across all required meals.
     */
    public void feed(String food) {
        double portion = dailyPortionKg() / requiredMealsPerDay;
        feed(food, portion);
    }

    /**
     * Overloaded feeding method allowing manual portion control.
     * It also tracks the number of meals fed for the current day.
     */
    public void feed(String food, double portionKg) {
        if (portionKg <= 0)
            throw new IllegalArgumentException("portion must be positive");

        if (mealsFedToday >= requiredMealsPerDay) {
            System.out.printf("%s already had %d/%d meals today.%n",
                    name, mealsFedToday, requiredMealsPerDay);
            return;
        }

        mealsFedToday++;
        System.out.printf("%s (%s) ate %.2f kg of %s. [%d/%d meals]%n",
                name, species, portionKg, food,
                mealsFedToday, requiredMealsPerDay);
    }

    // Display Method
    /**
     * Displays current information about the animal, including ID,
     * species, diet, feeding progress, and daily food requirement.
     */
    public void displayStatus() {
        System.out.printf("[%s] %s (%s, %.1f kg, %s)  Meals: %d/%d  Daily portion: %.2f kg%n",
                animalID, name, species, weightKg, dietProfile,
                mealsFedToday, requiredMealsPerDay, dailyPortionKg());
    }

    // Getters
    public String getAnimalID() { return animalID; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public double getWeightKg() { return weightKg; }
    public String getDietProfile() { return dietProfile; }
    public int getRequiredMealsPerDay() { return requiredMealsPerDay; }
    public int getMealsFedToday() { return mealsFedToday; }
}
