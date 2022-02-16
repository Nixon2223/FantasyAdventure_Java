import Items.Weapon.Weapon;
import Items.Weapon.WeaponType;
import Player.Heros.Jerry;
import Player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Jerry jerry;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.BROOM, 10);
        jerry = new Jerry(5, 5, 5 );
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
        Weapon newWeapon = new Weapon(WeaponType.BROOM, 10);
        player.equipWeapon(newWeapon);
        assertEquals(newWeapon, player.getEquippedWeapon());
        assertEquals(1, player.inventoryCount());
    }



}
