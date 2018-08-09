import Enemy.Defend.Dragon;
import Enemy.Defend.Ogre;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OgreTest {
    Ogre ogre_1;

    @Before
    public void before(){
        ogre_1 = new Ogre(200, 20);
    }
    @Test
    public void hasDefend(){
        assertEquals(20, ogre_1.getDefend());
    }

    @Test
    public void canDefend(){
        assertEquals(20, ogre_1.defend());
    }


}

