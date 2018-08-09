import Enemy.Defend.Dragon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DragonTest {
     Dragon dragon_1;

     @Before
     public void before(){
         dragon_1 = new Dragon(1000, 50);
     }
     @Test
     public void hasDefend(){
         assertEquals(50, dragon_1.getDefend());
    }

    @Test
    public void canDefend(){
         assertEquals(50, dragon_1.defend());
    }


}
