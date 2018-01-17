import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponWarriorTest {

    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;
    Weapon weapon1;
    Weapon weapon2;
    Weapon weapon3;

    @Before
    public void before(){
        weapon1 = new Weapon(WeaponType.SWORD);
        weapon2 = new Weapon(WeaponType.AXE);
        weapon3 = new Weapon(WeaponType.CLUB);
        dwarf = new Dwarf(100,"Edinburgh", weapon1);
        barbarian = new Barbarian(100,"Edinburgh", weapon2);
        knight = new Knight(100,"Edinburgh", weapon3);
    }

    @Test
    public void dwarfHasLocation(){
        assertEquals("Edinburgh", dwarf.getLocation());
    }

    @Test
    public void dwarfCanFight(){
        assertEquals("I'm in Edinburgh and i fight with a Sword", dwarf.fight());
    }

    @Test
    public void dwarfHealthReducesWhenAttacked(){
        dwarf.getAttacked();
        assertEquals(80, dwarf.getHealth());
    }

}
