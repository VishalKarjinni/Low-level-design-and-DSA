package structural_design_pattern.decorator;

public class GunPowerUp extends CharacterDecorator{

    public GunPowerUp(Character character) {
        super(character);
    }

    @Override
    public String getAbility() {
        return character.getAbility() + " GunPowerUp";
    }
}
