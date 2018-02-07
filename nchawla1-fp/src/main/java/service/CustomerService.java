/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import model.Customer;

/**
 *
 * @author Navtej
 */
@Named
@Stateless
public class CustomerService extends BaseService<Customer> {

    public CustomerService() {
        super(Customer.class);
    }

    @Override
    public List<Customer> findAll() {
        return getEntityManager().createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }

}
