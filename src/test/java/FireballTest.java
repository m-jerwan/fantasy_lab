import Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FireballTest {
    Fireball fireball_1;

    @Before
    public void before(){
        fireball_1 = new Fireball(30);
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
