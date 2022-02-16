package Items.Weapon;

import Items.Item;

public class Weapon extends Item {
    private WeaponType weaponType;


    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType.getType();
    }

}
