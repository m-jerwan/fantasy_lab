import Spell.Fireball;
import Spell.IceBlast;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceBlastTest {
    IceBlast iceBlast_1;

    @Before
    public void before(){
        iceBlast_1= new IceBlast(30);
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(30, iceBlast_1.getDamage() );
    }

    @Test
    public void canCast(){
        assertEquals(30, iceBlast_1.cast());
    }
}

