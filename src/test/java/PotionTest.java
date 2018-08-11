import Player.Cleric.Potion;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PotionTest {
    Potion potion_1;

    @Before
    public void before(){
        potion_1 = new Potion(30, 10);
    }

    @Test
    public void hasType(){
        assertEquals("Potion",potion_1.getType());
    }

    @Test
    public void hasHealingPower(){
        assertEquals(30, potion_1.getHealingPower());
    }

//    @Test
//    public void canHeal(){
//        assertEquals(30, potion_1.heal());
//    }

    @Test
    public void isToxic(){
        assertEquals(10, potion_1.getToxicity());
    }
}
