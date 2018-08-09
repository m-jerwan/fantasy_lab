package Enemy.Defend;

import Enemy.Enemy;

public class Dragon extends Enemy implements IDefend {
    private int defend;

    public Dragon(int healthPoints, int baseDefend) {
        super(healthPoints);
        this.defend = baseDefend;
    }

    public int getDefend() {
        return defend;
    }

    @Override
    public int defend() {
        return this.defend;
    }
}
