/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import model.security.User;

/**
 *
 * @author Navtej
 */

@Entity
@NamedQuery(name = "Customer.findAll", query = "select c from Customer c")
public class Customer extends BaseEntity implements Serializable{
    
    @Id
    private int customerId;
    
    private String customerAddress;
    
    private String name;

    @OneToOne
    @JoinColumn(name = "USERNAME")
    private User user;
    
    public Customer(){
        
    }
    
    public Customer(int customerId, String customerAddress) {
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerAddress=" + customerAddress + ", name=" + name + '}';
    }

   
    
}
