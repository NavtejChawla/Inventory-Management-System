/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Navtej
 */

@MappedSuperclass
public class BaseEntity implements Serializable {

    public BaseEntity() {
    }
    


    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    private String customerName;

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "BaseEntity{" + "bookingDate=" + bookingDate + ", customerName=" + customerName + '}';
    }

}
