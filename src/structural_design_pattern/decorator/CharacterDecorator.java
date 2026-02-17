package structural_design_pattern.decorator;

abstract class CharacterDecorator implements Character{
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }
}
