package structural_design_pattern.decorator;

public class StartPowerUp extends CharacterDecorator{
    public StartPowerUp(Character character) {
        super(character);
    }

    @Override
    public String getAbility() {
        return character.getAbility() + " StartPowerUp for limited time";
    }
}
