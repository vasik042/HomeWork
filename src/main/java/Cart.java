import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Embeddable
//@Entity
//@Table(name = "Cart")
public class Cart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column(name = "name")
    private String name;
//    @Column(name = "total")
    private int total;

    private Set<Item> items = new HashSet<>();

    public Cart(String name, Set<Item> items) {
        this.name = name;
        this.items = items;
        if (!items.isEmpty()){
            for (Item i: items) {
                this.total += i.getTotal();
            }
        }else {
            this.total = 0;
        }
    }


    public Cart(int id, String name, int total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    Cart(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
