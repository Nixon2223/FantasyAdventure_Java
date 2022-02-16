package Items.Weapon;

import Items.Item;

public class Weapon extends Item {
    private WeaponType weaponType;
    private int price;


    public Weapon(WeaponType weaponType, int price) {
        super(price);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType.getType();
    }

    public int getPrice() {
        return price;
    }
}
