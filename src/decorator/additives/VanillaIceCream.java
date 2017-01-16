package decorator.additives;

import decorator.Additive;
import decorator.Beverage;

/**
 * Vanilla Ice Cream is an additive to the existing beverages.
 */
public class VanillaIceCream extends Additive {
    private String additiveName = "Vanilla Ice-Cream";
    private double cost = 15.55;
    private Beverage beverage;

    public VanillaIceCream(Beverage beverage) {
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
