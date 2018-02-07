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
@Table(name = "shipments")
public class Shipments implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shipmentid;
    @Temporal(TemporalType.DATE)
    private Date shipmentDate;
    private long shipmentNumber;

//    private Orders order;
    public long getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(long shipmentid) {
        this.shipmentid = shipmentid;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }
    // @ManyToOne
    // private Orders order;

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public long getShipmentNumber() {
        return shipmentNumber;
    }

    public Shipments(long shipmentid, Date shipmentDate, long shipmentNumber) {
        this.shipmentid = shipmentid;
        this.shipmentDate = shipmentDate;
        this.shipmentNumber = shipmentNumber;
    }

    public Shipments() {
    }

    public void setShipmentNumber(long shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String toString() {

        return "shipmentDate: " + this.shipmentDate + ", shipmentNumber: " + this.shipmentNumber;
    }

}
