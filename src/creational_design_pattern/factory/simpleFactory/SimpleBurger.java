package creational_design_pattern.factory.simpleFactory;

public class SimpleBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
