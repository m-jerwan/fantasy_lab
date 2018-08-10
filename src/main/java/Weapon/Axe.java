package Weapon;

public class Axe implements IWeapon {

    private int baseDamage;
    private String type;

    public Axe(int baseDamage) {
        this.baseDamage = baseDamage;
        this.type = "Axe";
    }



    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public int use() {
        return this.baseDamage;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
