package creational_design_pattern.factory.factoryMethod;

import creational_design_pattern.factory.factoryMethod.Burger;

public class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Burger with bun, patty, cheese, and lettuce!");
    }
}
