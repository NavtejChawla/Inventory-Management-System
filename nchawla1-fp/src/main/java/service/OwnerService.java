/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import model.Owner;

/**
 *
 * @author Navtej
 */
@Named
@Stateless
public class OwnerService extends BaseService<Owner> {

    public OwnerService() {
        super(Owner.class);
    }

    @Override
    public List<Owner> findAll() {
        return getEntityManager().createNamedQuery("Owner.findAll", Owner.class).getResultList();
    }

    public Owner findByUsername(String username){
        return getEntityManager().createNamedQuery("Owner.findByUsername", Owner.class).setParameter("userName", username).getSingleResult();
    }
    
}
