import Items.Food.Cheese;
import Items.Weapon.Weapon;
import Items.Weapon.WeaponType;
import Player.Heros.Jerry;
import Player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    Player player;
    Jerry jerry;
    Weapon weapon;
    Cheese cheese;

    @Before
    public void before(){

        weapon = new Weapon(WeaponType.BROOM);
        jerry = new Jerry();
        player = new Player(jerry);
    }

    @Test
    public void hasWeapon(){
        player.equipWeapon(weapon);
        assertEquals(weapon, player.getEquippedWeapon());
    }

    @Test
    public void canSwapWeapon(){
        player.equipWeapon(weapon);
        assertEquals(weapon, player.getEquippedWeapon());
        Weapon newWeapon = new Weapon(WeaponType.BROOM);
        player.equipWeapon(newWeapon);
        assertEquals(newWeapon, player.getEquippedWeapon());
        assertEquals(1, player.inventoryCount());

    }

    @Test
    public void canNotEquipWeaponOfDifferentType(){
        Weapon newWeapon = new Weapon(WeaponType.PAN);
        player.equipWeapon(newWeapon);
        assertNull(player.getEquippedWeapon());
    }

    @Test
    public void canUseHeroAbility(){
        player.useAbility();
        assertEquals(1, player.inventoryCount());
    }

    @Test
    public void canEatCheese(){
        Cheese cheese = new Cheese(3);
        player.eat(cheese);
        assertEquals(110, player.getHealth());
        assertEquals(2, cheese.getQuantity());
    }



}
