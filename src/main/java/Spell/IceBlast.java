package Spell;

public class IceBlast  implements  ISpell{
    private int damage;
    private String type;
    private int manaCost;

    public IceBlast(int baseDamage, int manaCost) {
        this.damage = baseDamage;
        this.type = "IceBlast";
        this.manaCost = manaCost;
    }

    @Override
    public int cast() {
        return this.damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }

}
