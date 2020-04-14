package one_to_one;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table (name = "life")
public class Life {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "value")
    int value;
    @Column(name = "life")
    String description;

    @OneToOne(mappedBy = "humanLife")
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Human human;

    public Life(int value, String description, Human human) {
        this.value = value;
        this.description = description;
        this.human = human;
    }

    Life(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
