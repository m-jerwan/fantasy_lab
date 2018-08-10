package Weapon;

public class Club implements IWeapon{
    private int baseDamage;
    private String type;

    public Club(int baseDamage) {
        this.baseDamage = baseDamage;
        this.type = "Club";
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
