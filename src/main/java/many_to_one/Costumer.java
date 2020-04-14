package many_to_one;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "costumer")
public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costumer_id")
    int id;

    @Column(name = "email")
    String email;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @OneToMany(mappedBy = "costumer")
    Set<Purchase> purchases;

    public Costumer(){}

    public Costumer(String name, String surname, String email){
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.purchases = new HashSet<>();
    }

    public void addPurchase(String productName, int price){
        this.purchases.add(new Purchase(productName, price, this));
    }

    public void addPurchase(Purchase purchase){
        this.purchases.add(purchase);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }
}
