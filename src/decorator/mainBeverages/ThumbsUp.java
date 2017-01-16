package decorator.mainBeverages;

import decorator.Beverage;

/**
 * ThumbsUp is a type of beverage.
 */
public class ThumbsUp extends Beverage {
    private double cost = 29.99;

    public ThumbsUp() {
        beverageDescription = "Thumbs Up";
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
