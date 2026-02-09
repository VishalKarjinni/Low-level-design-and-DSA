package creational_design_pattern.prototype;

public class Character implements Cloneable{
    public String name;
    public int health;
    public int level;
    public int attckPower;

    public Character(String name, int health, int level, int attckPower) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.attckPower = attckPower;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }

    public void showCharacterInfo() {
        System.out.println("[name= " + name + ", Health= " + health + ", level= " + level + ", PowerAttack= " + attckPower + " ]");
    }



}
