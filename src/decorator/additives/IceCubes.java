package decorator.additives;

import decorator.Additive;
import decorator.Beverage;

/**
 * Ice Cubes is an additive to the existing beverages.
 */
public class IceCubes extends Additive {
    private String additiveName = "Ice Cubes";
    private double cost = 3.75;
    private Beverage beverage;

    public IceCubes(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getBeverageDescription() {
        return beverage.getBeverageDescription() + ", " + additiveName;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }
}
