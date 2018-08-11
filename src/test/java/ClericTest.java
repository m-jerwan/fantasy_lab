import Player.Cleric.Cleric;
import Player.Cleric.Potion;
import Player.Fighter.Barbarian;
import Player.Player;
import Weapon.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ClericTest {
    Cleric cleric_01;
    Potion potion_1;
    Club club_1;
    Barbarian barbarian_1;

    @Before
    public void before(){
        club_1 = new Club(20);
        barbarian_1 = new Barbarian("Conan", 40, 90, club_1 );
        potion_1 = new Potion(10, 20);
        cleric_01 = new Cleric("Ted");

    }


    @Test
    public void canPerformHealingInjuredNotToxic(){
        barbarian_1.setHealthPoints(-99);
        assertTrue( cleric_01.performHealning(barbarian_1, potion_1));
    }

    @Test
    public void cantPerformHealingFullHealthNotToxic(){
        assertFalse( cleric_01.performHealning(barbarian_1, potion_1));
    }

    @Test
    public void cantPerformHealingInjuredToxic(){
        barbarian_1.setBodyToxicity(99);
        barbarian_1.setHealthPoints(-99);
        assertFalse( cleric_01.performHealning(barbarian_1, potion_1));
    }

    @Test
    public void cantPerformHealingFullHealthToxic(){
        barbarian_1.setBodyToxicity(99);
        assertFalse( cleric_01.performHealning(barbarian_1, potion_1));
    }

}
