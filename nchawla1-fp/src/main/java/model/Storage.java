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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Navtej
 */
@Entity
@Table(name = "storage")
public class Storage implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sno;
    
    private String name;

    @OneToOne(optional=true)
    @JoinColumn(name="itemId")
    private List<Inventory> inventory;

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }
    
    public Storage() {
    }

    public Storage(String name, long sno) {
        this.name = name;
        this.sno = sno;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }
    //To change body of generated methods, choose Tools | Templates.

    public String toString() {

        return "name: " + this.name + ", sno: " + this.sno;
    }
}
