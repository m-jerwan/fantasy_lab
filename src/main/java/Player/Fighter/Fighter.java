package Player.Fighter;

import Player.Player;
import Weapon.IWeapon;

public abstract class Fighter extends Player {

    int stamina;
    int strenght;
    IWeapon weapon;

    public Fighter(String name, int stamina, int strength, IWeapon weapon) {
        super(name);
        this.stamina = stamina;
        this.strenght = strength;
        this.weapon = weapon;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strenght;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public int attack(){
        return this.weapon.use();
    }
}
