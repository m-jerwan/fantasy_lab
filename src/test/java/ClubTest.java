import Weapon.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClubTest {

    Club club_1;

    @Before
    public void before(){
        club_1 = new Club(10);
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(10, club_1.getBaseDamage());
    }

    @Test
    public void canUse(){
        assertEquals(10,club_1.use());
    }
}
