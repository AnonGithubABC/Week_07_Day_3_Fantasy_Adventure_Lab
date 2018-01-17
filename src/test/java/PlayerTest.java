import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    WeaponWarrior weaponWarrior;
    SpellWarrior spellWarrior;
    HealingWarrior healingWarrior;

    @Before
    public void before(){
//        weaponWarrior = new WeaponWarrior(100, "healing", "Edinburgh");
//        spellWarrior = new SpellWarrior(100, "spell", "Edinburgh");
//        healingWarrior = new HealingWarrior(100, "weapon", "Edinburgh");
    }

    @Test
    public void weaponWarriorHasTool(){
        assertEquals("I have a weapon tool", weaponWarrior.hasTool("weapon"));
    }

    @Test
    public void spellWarriorHasTool(){
        assertEquals("I have a spell tool", spellWarrior.hasTool("spell"));
    }

    @Test
    public void healingWarriorHasTool(){
        assertEquals("I have a healing tool", healingWarrior.hasTool("healing"));
    }

    @Test
    public void weaponWarriorHasHealth(){
        assertEquals(100, healingWarrior.getHealth());
    }


}
