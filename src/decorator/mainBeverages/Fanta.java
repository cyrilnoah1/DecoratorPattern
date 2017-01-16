package decorator.mainBeverages;

import decorator.Beverage;

/**
 * Fanta is a type of beverage.
 */
public class Fanta extends Beverage {
    private double cost = 32.29;

    public Fanta() {
        beverageDescription = "Fanta";
    }

    @Override
    public double cost() {
        return cost;
    }

    /*GETTERS and SETTERS*/
    public void setCost(double cost) {
        this.cost = cost;
    }
}
