import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Embeddable
//@Entity
//@Table(name = "Item")
public class Item {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column(name = "total")
    private int total;

    private Set<Cart> carts;

    public Item(int total) {
        this.total = total;
        this.carts = new HashSet<>();
    }


    public Item(int id, int total) {
        this.id = id;
        this.total = total;
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

