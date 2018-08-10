import Player.Fighter.Knight;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
    Sword sword_1;
    Knight knight_1;


    @Before
    public void before(){
        sword_1 = new Sword(30);
        knight_1 = new Knight("Black",20, 10, sword_1 );
    }

    @Test
    public void haveWeapon(){
        assertEquals("Sword", knight_1.getWeapon().getType());
    }
}

