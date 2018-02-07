/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Shipments;

/**
 *
 * @author Navtej
 */
@Stateless
public class ShipmentService {

    @PersistenceContext(unitName = "nchawla1PU")
    private EntityManager em;

    public ShipmentService() {
    }

    // Create
    public void create(Shipments s) {
        em.persist(s);
    }

    // Read
    public Shipments find(int i) {
        return em.find(Shipments.class, i);
    }

    // Update
    // JTA is managing the transaction!
    public void update(Shipments s) {
        em.merge(s);
    }

    // Delete
    public void remove(Shipments s) {
        em.remove(em.merge(s));
    }

    public List<Shipments> findAll() {
        return em.createQuery("Select s from Shipments s", Shipments.class).getResultList();
    }

}
