package Items.Weapon;

public enum WeaponType {
    SWORD(10),
    DAGGER(5),
    MACE(15);

    private final int baseDamage;

    WeaponType(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
}
