package ru.marksblog.model;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
>>>>>>> master

@Entity
@Table(name = "Ads")
public class Ad {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
>>>>>>> master
    private int id;
    @Column(name = "category")
    private String category;
    @Column(name = "ad_name")
    private String adname;
    @Column(name = "description")
    private String description;
    @Column(name = "phone")
    private int phone;

    public Ad() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getAdname() + " " + getCategory() + " " + getDescription();
    }
}
