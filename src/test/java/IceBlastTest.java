import Spell.IceBlast;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceBlastTest {
    IceBlast iceBlast_1;

    @Before
    public void before(){
        iceBlast_1= new IceBlast(30, 10);
    }

    @Test
    public void hasName(){
        assertEquals("IceBlast", iceBlast_1.getType());
    }

    @Test
    public void hasManaCost(){
        assertEquals(10, iceBlast_1.getManaCost());
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

