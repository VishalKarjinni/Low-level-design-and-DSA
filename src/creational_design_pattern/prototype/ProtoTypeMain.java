package creational_design_pattern.prototype;

public class ProtoTypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterFactory characterFactory = new CharacterFactory();
        Character newCharacter = characterFactory.createCharacterNewName("vishal");
        newCharacter.showCharacterInfo();
    }
}
