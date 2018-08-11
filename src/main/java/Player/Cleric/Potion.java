package Player.Cleric;


import java.util.ArrayList;

public class Potion implements IHeal{
    private String type;
    private int healingPower;
    private int toxicity;
    ArrayList<Integer> healingData;

    public Potion(int healingPower, int toxicity) {
        this.healingPower = healingPower;
        this.type = "Potion";
        this.toxicity = toxicity;
    }

    public String getType() {
        return type;
    }

    public int getHealingPower() {
        return healingPower;
    }

    @Override
    public Integer[] heal() {
        Integer[] healingData = {healingPower, toxicity};
        return healingData;
    }

    public int getToxicity() {
        return toxicity;
    }
}
