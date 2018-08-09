package Enemy;

public abstract class Enemy {
    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

}
