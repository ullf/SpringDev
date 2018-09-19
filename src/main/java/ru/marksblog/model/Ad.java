package ru.marksblog.model;

import javax.persistence.*;

@Entity
@Table(name = "Ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "category", unique = true, nullable = false)
    private String category;
    @Column(name = "ad_name", unique = true, nullable = false)
    private String adname;
    @Column(name = "company", nullable = false)
    private String company;
    @Column(name = "description", nullable = false)
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
