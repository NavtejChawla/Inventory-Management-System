/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Navtej
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Temporal(TemporalType.DATE)
    private Date dateCompleted;
    @Temporal(TemporalType.DATE)
    private Date dateRequested;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderNumber;

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public Orders() {
    }

    public Orders(Date dateCompleted, Date dateRequested, long orderNumber) {
        this.dateCompleted = dateCompleted;
        this.dateRequested = dateRequested;
        this.orderNumber = orderNumber;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String toString() {

        return "dateCompleted: " + this.dateCompleted + ", dateRequested: " + this.dateRequested + "orderNumber: " + this.orderNumber;
    }
}
