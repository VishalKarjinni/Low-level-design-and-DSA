package creational_design_pattern.factory.factoryMethod;

public class KingBurgerFactory implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {

            if (type.equalsIgnoreCase("basic")) {
                return new BasicWheatBurger();
            } else if (type.equalsIgnoreCase("standard")) {
                return new StandardWheatBurger();
            } else if (type.equalsIgnoreCase("premium")) {
                return new PremiumWheatBurger();
            } else {
                System.out.println("Invalid burger type!");
                return null;
            }
        }

}
