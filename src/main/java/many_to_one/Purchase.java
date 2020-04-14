package many_to_one;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="purchase_date")
    Date purchaseDate;

    @Column(name="product_name")
    String productName;

    @Column(name="price")
    int price;

    @ManyToOne
    @JoinColumn(name="costumer_id", nullable=false)
    Costumer costumer;

    public Purchase(){}

    public Purchase(String productName, int price, Costumer costumer){
        this.costumer = costumer;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }
}
