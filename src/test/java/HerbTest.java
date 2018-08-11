import Player.Cleric.Herb;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HerbTest {
    Herb herb_1;

    @Before
    public void before(){
        herb_1 = new Herb(5);
    }

    @Test
    public void hasType(){
        assertEquals("Herb", herb_1.getType());
    }

    @Test
    public void hasHealingPower(){
        assertEquals(5, herb_1.getHealingPower());
    }

    @Test
    public void canHeal(){
        Integer expected = 5;
        assertEquals(expected, herb_1.heal()[0]);
    }

}
