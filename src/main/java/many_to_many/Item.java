package many_to_many;

import many_to_many.Cart;

import java.util.HashSet;
import java.util.Set;


public class Item {
    private int id;
    private int total;

    private Set<Cart> carts;


    public Item(int total) {
        this.total = total;
        this.carts = new HashSet<>();
    }


    public Item(int id, int total) {
        this.id = id;
        this.total = total;
        this.carts = new HashSet<>();
    }

    Item(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }
}

