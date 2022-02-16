package Player.Heros;

import Items.Weapon.Weapon;

import java.util.ArrayList;

public abstract class Hero {
    private String name;
    private Weapon weapon;
    private int strength;
    private int agility;
    private int defence;

    public Hero(Weapon weapon, int strength, int agility, int defence) {
        this.weapon = weapon;
        this.strength = strength;
        this.agility = agility;
        this.defence = defence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeaponType(ArrayList<String> weaponType) {
        this.weaponType = weaponType;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getWeaponType() {
        return weaponType;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getDefence() {
        return defence;
    }
}
