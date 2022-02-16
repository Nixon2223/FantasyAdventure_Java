package Player.Heros;

import Items.Food.Cheese;
import Items.Weapon.Weapon;

import java.util.ArrayList;


public class Jerry implements IHero{


    private ArrayList<String> weaponTypes;
    private int strength;
    private int agility;
    private int defense;

    public Jerry() {
        this.weaponTypes = new ArrayList<String>();
        this.weaponTypes.add("two-handed");
        this.strength = 5;
        this.agility = 7;
        this.defense = 10;
    }

    public ArrayList<String> getWeaponTypes() {
        return weaponTypes;
    }
    public int getStrength() {
        return strength;
    }
    public int getAgility() {
        return agility;
    }

    public int getDefence() {
        return defense;
    }

    public void getAbility() {

    }
    public Cheese findCheese(){
        return new Cheese(3);
    }
}
