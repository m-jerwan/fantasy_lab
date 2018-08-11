package Player.Cleric;

import Player.Player;


public class Cleric extends Player {
    Player player;


    public Cleric(String name) {
        super(name);
    }

    public boolean performHealning(Player player,IHeal healingMethod) {
        if (player.getBodyToxicity() < 99 && player.getHealthPoints() < 100) {
            // TODO : not very meaningfull code
            player.setHealthPoints(healingMethod.heal()[0]);
            player.setBodyToxicity(healingMethod.heal()[1]);
            return true;
        }
        return false;
    }
}
