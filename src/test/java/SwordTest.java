import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SwordTest {

    Sword sword_1;

    @Before
    public void before(){
        sword_1 = new Sword(40);
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(40, sword_1.getBaseDamage());
    }

    @Test
    public void canUse(){
        assertEquals(40, sword_1.use());
    }
}
