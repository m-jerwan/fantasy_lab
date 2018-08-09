package Enemy.Defend;

import Enemy.Enemy;

public class Ogre extends Enemy implements IDefend {
    private int defend;

    public Ogre(int healthPoints, int defend) {
        super(healthPoints);
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }

    @Override
    public int defend() {
        return this.defend;
    }
}
