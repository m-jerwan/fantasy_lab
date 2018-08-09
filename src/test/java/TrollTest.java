

import Enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    public class TrollTest {
        Troll troll_1;

        @Before
        public void before(){
            troll_1 = new Troll(500);
        }

        @Test
        public void hasHealthPoints(){
            assertEquals(500, troll_1.getHealthPoints());
        }

        @Test
        public void canTakeDamage(){
            troll_1.takeDamage(10);
            assertEquals(490, troll_1.getHealthPoints());
        }


    }
