/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Navtej
 */
@Entity
@Table(name = "inventory")
@DiscriminatorValue(value = "Inventory")
public class Inventory implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    
    private long inventoryId;

    private int Quantity;  
    
    @OneToOne(mappedBy = "inventory" , targetEntity=Storage.class, optional=true, cascade = CascadeType.ALL)
    private List<Storage> storage;
    
    @ManyToMany(targetEntity=Items.class, mappedBy = "inventory")
    private List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<Storage> getStorage() {
        return storage;
    }

    public void setStorage(List<Storage> storage) {
        this.storage = storage;
    }
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public Long getInvetoryId() {
        return inventoryId;
    }

    public void setInvetoryId(long invetoryId) {
        this.inventoryId = invetoryId;
    }

    /**
     * Get the value of Quantity
     *
     * @return the value of Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * Set the value of Quantity
     *
     * @param Quantity new value of Quantity
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Inventory() {
    }

    public Inventory( long itemId, int Quantity) {
        
        this.itemId = itemId;
        this.Quantity = Quantity;
    }
    
    public Inventory( long itemId, long inventoryId,int Quantity) {
        
        this.itemId = itemId;
        this.inventoryId = inventoryId;
        this.Quantity = Quantity;
    }

    public String toString() {

        return "itemId: " + this.itemId + ", invetoryId: " + this.inventoryId + ", Quantity: " + this.Quantity;
    }

}
