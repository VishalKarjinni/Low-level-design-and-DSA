package structural_design_pattern.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Character mario = new Mario();
        System.out.println("Basic Character: " + mario.getAbility());

        // Decorate Mario with a HeightUp power-up.
        mario = new HeightUp(mario);
        System.out.println("After HeightUp: " + mario.getAbility());

        // Decorate Mario further with a GunPowerUp.
        mario = new GunPowerUp(mario);
        System.out.println("After GunPowerUp: " + mario.getAbility());

        // Finally, add a StarPowerUp decoration.
        mario = new StartPowerUp(mario);
        System.out.println("After StarPowerUp: " + mario.getAbility());
    }
}
