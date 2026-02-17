package structural_design_pattern.decorator;

public class HeightUp extends CharacterDecorator{

    public HeightUp(Character character) {
        super(character);
    }

    @Override
    public String getAbility() {
        return character.getAbility() + " HeightUp";
    }
}
