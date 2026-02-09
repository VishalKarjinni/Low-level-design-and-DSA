package creational_design_pattern.factory.simpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        String s = "Standard";
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(s);
        if (burger != null) {
            burger.prepare();
        }

    }
}
