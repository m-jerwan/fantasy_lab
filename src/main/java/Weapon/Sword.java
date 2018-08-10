package Weapon;

public class Sword implements IWeapon {
    private int baseDamage;
    private String type;


    public Sword(int baseDamage) {
        this.baseDamage = baseDamage;
        this.type = "Sword";
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
