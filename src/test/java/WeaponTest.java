import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
       weapon = new Weapon(WeaponType.SWORD);
    }

    @Test
    public void getWeaponTypeValue(){
        assertEquals(20, weapon.getWeaponTypeValue());
    }

}
