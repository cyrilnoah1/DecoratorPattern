package decorator;

/**
 * Parent class for all the beverages.
 */
public abstract class Beverage {
    public String beverageDescription = "Unknown";

    public String getBeverageDescription() {
        return beverageDescription;
    }

    public abstract double cost();
}
