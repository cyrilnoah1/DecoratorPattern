import decorator.Beverage;
import decorator.additives.IceCubes;
import decorator.additives.VanillaIceCream;
import decorator.mainBeverages.CocaCola;
import decorator.mainBeverages.Fanta;
import decorator.mainBeverages.ThumbsUp;

/**
 * Class containing main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String[] args) {
        // Ordering beverages.
        orderBeverages();
    }

    // TODO: Make the order dynamic: let the user customize the order.

    /**
     * Setting up the different beverages that need to
     * be added to the order.
     */
    private static void orderBeverages() {
        // Ordering Coke-Float by combining CocaCola and Vanilla ice cream.
        Beverage cocaCola = new CocaCola();
        cocaCola = new VanillaIceCream(cocaCola);
        cocaCola = new IceCubes(cocaCola);

        // Ordering a regular fanta.
        Beverage fanta = new Fanta();

        // Ordering a ThumbsUp with extra ice cubes.
        Beverage thumbsUp = new ThumbsUp();
        thumbsUp = new IceCubes(thumbsUp);

        // CocaCola order details.
        System.out.println("Order 1:");
        System.out.println(cocaCola.getBeverageDescription() + " Cost: Rs." + cocaCola.cost() + "/-");
        System.out.println("");
        // Fanta order details.
        System.out.println("Order 2:");
        System.out.println(fanta.getBeverageDescription() + " Cost: Rs." + fanta.cost() + "/-");
        System.out.println("");
        // ThumbsUp order details.
        System.out.println("Order 3:");
        System.out.println(thumbsUp.getBeverageDescription() + " Cost: Rs." + thumbsUp.cost() + "/-");
        System.out.println("");

    }
}
