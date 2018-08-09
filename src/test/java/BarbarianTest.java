import Player.Fighter.Barbarian;
import Weapon.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {
    Club club_1;
    Barbarian barbarian_1;


    @Before
    public void before(){
        club_1 = new Club(20);
        barbarian_1 = new Barbarian("Conan", 40, 90, club_1 );
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian_1.getName());
    }

    @Test
    public void hashealth(){
        assertEquals(100, barbarian_1.getHealthPoints());
    }


    @Test
    public void hasStamina(){
        assertEquals(40,barbarian_1.getStamina());
    }

    @Test
    public void hasStrength(){
        assertEquals(90, barbarian_1.getStrength());
    }

    @Test
    public void haveWeapon(){
        assertEquals("Club", barbarian_1.getWeapon().type());
    }

    @Test
    public void canAttack(){
        assertEquals(20, barbarian_1.attack());

    }
}
