package Player;

public abstract class Player {
   private String name;
   private int healthPoints;
   private int bodyToxicity;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.bodyToxicity = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints += healthPoints;
    }

    public int getBodyToxicity() {
        return bodyToxicity;
    }

    public void setBodyToxicity(int newBodyToxicity) {
        this.bodyToxicity += newBodyToxicity;
    }
}
