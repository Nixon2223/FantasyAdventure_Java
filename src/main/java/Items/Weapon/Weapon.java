package Items.Weapon;

public class Weapon {
    private WeaponType weaponType;
    private int price;


    public Weapon(WeaponType weaponType, int price) {
        this.weaponType = weaponType;
        this.price = price;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getPrice() {
        return price;
    }
}
