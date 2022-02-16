package Player.Heros;

import Items.Food.Cheese;
import Items.Weapon.Weapon;

import java.util.ArrayList;

public class Jerry extends Hero{
    public Jerry(Weapon weaponType, int strength, int agility, int defence) {
        super(weaponType, strength, agility, defence);
    }

        public Cheese findCheese(){
            return new Cheese(3, 10);
        }
    }
