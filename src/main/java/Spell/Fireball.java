package Spell;

public class Fireball implements ISpell{
    private int damage;

    public Fireball(int baseDamage) {
        this.damage = baseDamage;
    }

    @Override
    public int cast() {
        return this.damage;
    }

    public int getDamage() {
        return damage;
    }
}
