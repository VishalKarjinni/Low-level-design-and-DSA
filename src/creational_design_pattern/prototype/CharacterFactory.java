package creational_design_pattern.prototype;

public class CharacterFactory {
    private Character prototypeCharacter;

    public CharacterFactory() {
        prototypeCharacter = new Character("DefaultName", 100, 50, 1);
    }

    public Character createCharacterNewName(String name) throws CloneNotSupportedException {
        Character cloneCharacter = prototypeCharacter.clone();
        cloneCharacter = new Character(name, cloneCharacter.health, cloneCharacter.level, cloneCharacter.attckPower);
        return cloneCharacter;
    }

    public Character createCharacterNewLevel(int level) throws CloneNotSupportedException {
        Character cloneCharacter = prototypeCharacter.clone();
        cloneCharacter = new Character(cloneCharacter.name, cloneCharacter.health, level, cloneCharacter.attckPower);
        return cloneCharacter;
    }
}
