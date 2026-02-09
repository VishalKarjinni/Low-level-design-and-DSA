package creational_design_pattern.factory.factoryMethod;

public class SimpleBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
