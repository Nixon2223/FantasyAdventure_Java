package Items.Food;

import Player.Player;

public class Cheese extends Food implements IHeal{

    private int heal;

    public Cheese(int quantity) {
        super(quantity);
        this.heal = 10;
    }

    public void eat(Player player) {
    }

    public int getHeal() {
        return heal;
    }
}
