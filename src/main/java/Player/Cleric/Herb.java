package Player.Cleric;

import Player.Player;

import java.util.ArrayList;

public class Herb implements IHeal {
    private String type;
    private int healingPower;
//    ArrayList<Integer> healingData;


    public Herb(int healingPower) {
        this.healingPower = healingPower;
        this.type = "Herb";
    }

    public String getType() {
        return type;
    }

    public int getHealingPower() {
        return healingPower;
    }

    @Override
    public Integer[] heal() {
        Integer[] healingData = {healingPower, 0};
        return healingData;
    }
}