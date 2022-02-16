package Items.Food;

import Items.Item;
import Player.Player;

public abstract class Food extends Item {

    private int quantity;

    public Food(int quantity, int price) {
        super(price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void eat(Player player);
}

