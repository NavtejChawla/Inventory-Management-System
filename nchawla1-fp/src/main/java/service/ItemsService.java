/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Items;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Navtej
 */

@Stateless
public class ItemsService {
    
    @PersistenceContext(name = "nchawla1PU")
    EntityManager em;
    
    
     public List<Items> findAllItems(){
        return em.createQuery("select i from Items i", Items.class).getResultList();
    }
     
     public void updateItems(Items items){
         em.merge(items);
         
     }
     
      public void persistItem(Items items){
         em.persist(items);
         
     }
}
