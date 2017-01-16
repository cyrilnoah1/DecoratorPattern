package decorator.mainBeverages;

import decorator.Beverage;

/**
 * CocaCola is a type of beverage.
 */
public class CocaCola extends Beverage {
    private double cost = 35.99;

    public CocaCola() {
        beverageDescription = "CocaCola";
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
