import Weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AxeTest {

    Axe axe_1;

    @Before
    public void before(){
        axe_1 = new Axe(20);
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(20,axe_1.getBaseDamage());
    }

    @Test
    public void canUse(){
        assertEquals(20,axe_1.use());
    }

}
