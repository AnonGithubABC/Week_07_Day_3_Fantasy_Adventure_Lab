import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponWarriorTest {

    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;

    @Before
    public void before(){
        dwarf = new Dwarf(100, "weapon", "Edinburgh", "Sword");
        barbarian = new Barbarian(100, "weapon", "Edinburgh", "Axe");
        knight = new Knight(100, "weapon", "Edinburgh", "Club");
    }

    @Test
    public void dwarfHasLocation(){
        assertEquals("Edinburgh", dwarf.getLocation());
    }

    @Test
    public void dwarfCanFight(){
        assertEquals("I'm in Edinburgh and i fight with a Sword", dwarf.fight());
    }

}
