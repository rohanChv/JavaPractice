package com.example.amazon.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="item")
public class Item {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "item_sequence",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_category")
    private String itemCategory;

    @Column(name="item_stock")
    private Integer itemStock;

    @Column(name="item_expiry_date")
    private Date itemExpirydate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Integer getItemStock() {
        return itemStock;
    }

    public void setItemStock(Integer itemStock) {
        this.itemStock = itemStock;
    }

    public Date getItemExpirydate() {
        return itemExpirydate;
    }

    public void setItemExpirydate(Date itemExpirydate) {
        this.itemExpirydate = itemExpirydate;
    }
}
