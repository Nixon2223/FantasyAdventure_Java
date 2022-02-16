package Player;

import Items.Item;
import Items.Weapon.Weapon;

import java.util.ArrayList;

public class Player {

    private Hero hero;
    private int level;
    private int gold;
    private ArrayList<Item> inventory;
    private Weapon  equippedWeapon;
    private int health;

    public Player(Hero hero) {
        this.hero = hero;
        this.level = 0;
        this.gold = 0;
        this.inventory = new ArrayList<>();
        this.equippedWeapon = null;
        this.health = 100;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero getHero() {
        return hero;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public int getHealth() {
        return health;
    }
}