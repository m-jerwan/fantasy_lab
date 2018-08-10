import Player.Fighter.Dwarf;
import Weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    Axe axe_1;
    Dwarf dwarf_1;


    @Before
    public void before(){
        axe_1 = new Axe(40);
        dwarf_1 = new Dwarf("Gimli", 40, 50, axe_1 );
    }

    @Test
    public void haveWeapon(){
        assertEquals("Axe", dwarf_1.getWeapon().getType());
    }
}


