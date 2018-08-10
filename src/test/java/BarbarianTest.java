import Player.Fighter.Barbarian;
import Weapon.Club;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {
    Club club_1;
    Club club_2;
    Sword sword_1;
    Barbarian barbarian_1;


    @Before
    public void before(){
        club_1 = new Club(20);
        club_2 = new Club(25);
        sword_1 = new Sword(10);
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
        assertEquals("Club", barbarian_1.getWeapon().getType());
    }

    @Test
    public void canAttack(){
        assertEquals(20, barbarian_1.attack());
    }

    @Test
    public void canSwapWeaponsOtherClub(){
        barbarian_1.swapWeapon(club_2);
       assertEquals("Club", barbarian_1.getWeapon().getType());
    }

    @Test
    public void canSwapWeaponsSword(){
        barbarian_1.swapWeapon(sword_1);
        assertEquals("Sword", barbarian_1.getWeapon().getType());
    }
}
