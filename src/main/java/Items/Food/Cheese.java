package Items.Food;

import Items.Item;
import Player.Player;

public class Cheese extends Item implements IHeal{

    private int heal;
    private int quantity;

    public Cheese(int quantity) {
        this.quantity = quantity;
        this.heal = 10;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public void eat(Player player) {
    }


    public int getHeal() {
        return heal;
    }
}
