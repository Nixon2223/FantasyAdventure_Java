package Items.Weapon;

public enum WeaponType {
    PAN(10, "heavy"),
    BROOM(5, "two-handed"),
    PLATES(15, "ranged");

    private final int baseDamage;
    private final String type;

    WeaponType(int baseDamage, String type) {
        this.baseDamage = baseDamage;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
}
