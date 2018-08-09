import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {
    Orc orc_1;

    @Before
    public void before(){
      orc_1 = new Orc(200);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200,orc_1.getHealthPoints());
    }


}
