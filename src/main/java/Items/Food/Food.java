package Items.Food;

import Items.Item;
import Player.Player;

public abstract class Food extends Item {

    private String type;
    private int quantity;

    public Food(String type, int quantity, int price) {
        super(price);
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void eat(Player player);
}

