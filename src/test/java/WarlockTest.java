import Player.Mage.Warlock;
import Spell.Fireball;
import Spell.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Fireball fireball_1;
    Warlock warlock_1;

    @Before
    public void before(){
        fireball_1 = new Fireball(20, 30);
        warlock_1 = new Warlock("Julian", 200, 10, fireball_1);
    }

    @Test
    public void hasName(){
        assertEquals("Julian",warlock_1.getName());
    }

    @Test
    public void hasMana(){
        assertEquals(200, warlock_1.getMana());
    }

    @Test
    public void canDefend(){
        assertEquals(10, warlock_1.defend());
    }

    @Test
    public void hasSpell(){
        assertEquals("Fireball",warlock_1.getSpell().getType());
    }


}
