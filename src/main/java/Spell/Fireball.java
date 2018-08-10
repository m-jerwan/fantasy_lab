package Spell;

public class Fireball implements ISpell{
    private int damage;
    private String type;
    private int manaCost;

    public Fireball(int baseDamage, int manaCost) {
        this.damage = baseDamage;
        this.type = "Fireball";
        this.manaCost = manaCost;
    }

    @Override
    public int cast() {
        return this.damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }
}
