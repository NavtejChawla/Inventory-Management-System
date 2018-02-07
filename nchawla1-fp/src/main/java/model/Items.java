/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Navtej
 */
@Entity
@Table(name = "items")
@NamedQuery(name="getAllItems", query="SELECT i FROM Items i where i.itemNumber = :itemNumber")
public class Items implements Serializable {

    private String itemDescription;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemNumber;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemId")
    private List<Inventory> inventory;

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Items(String itemDescription, long itemNumber) {
        this.itemDescription = itemDescription;
        this.itemNumber = itemNumber;
    }

    public Items() {
    }

    @Override
    public String toString() {
        return "Items{" + "itemDescription=" + itemDescription + ", itemNumber=" + itemNumber + '}';
    }

    
}
