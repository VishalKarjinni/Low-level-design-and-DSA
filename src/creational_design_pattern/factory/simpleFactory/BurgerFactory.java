package creational_design_pattern.factory.simpleFactory;

public class BurgerFactory {
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleBurger();
        } else if (type.equalsIgnoreCase("standard")) {
           return new StandardBurger();
        } else if (type.equalsIgnoreCase("premium")) {
           return new PremiumBurger();
        } else {
            System.out.println("Invalid burger type!");
           return null;
        }
    }
}
