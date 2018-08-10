import Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FireballTest {
    Fireball fireball_1;

    @Before
    public void before(){
        fireball_1 = new Fireball(30, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", fireball_1.getType());
    }

    @Test
    public void hasManaCost(){
        assertEquals(20, fireball_1.getManaCost());
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(30, fireball_1.getDamage() );
    }

    @Test
    public void canCast(){
        assertEquals(30, fireball_1.cast());
    }
}
