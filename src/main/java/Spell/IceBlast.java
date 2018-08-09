package Spell;

public class IceBlast  implements  ISpell{
    private int damage;

    public IceBlast(int baseDamage) {
        this.damage = baseDamage;
    }

    @Override
    public int cast() {
        return this.damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
