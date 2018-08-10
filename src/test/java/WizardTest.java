import Player.Mage.Wizard;
import Spell.ISpell;
import Spell.IceBlast;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class WizardTest {
    IceBlast iceBlast_1;
    Wizard wizard_1;

    @Before
    public void before(){
        iceBlast_1 = new IceBlast(20, 30);
        wizard_1 = new Wizard("Julian", 200, 10, iceBlast_1);
    }

    @Test
    public void hasName(){
        assertEquals("Julian",wizard_1.getName());
    }

    @Test
    public void hasMana(){
        assertEquals(200, wizard_1.getMana());
    }

    @Test
    public void canDefend(){
        assertEquals(10, wizard_1.defend());
    }

    @Test
    public void hasSpell(){
        assertEquals("IceBlast", wizard_1.getSpell().getType());
    }


}
