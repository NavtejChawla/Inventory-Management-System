/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.Owner;
import service.OwnerService;

/**
 *
 * @author Navtej
 */
@Named
@RequestScoped
public class OwnerController extends BaseController {

    @Inject
    LoginController loginController;
    @EJB 
    OwnerService ownerService;

    public OwnerController() {
    }

    private Owner owner;

    /**
     * Get the value of owner
     *
     * @return the value of owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Set the value of owner
     *
     * @param owner new value of owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @PostConstruct
    protected void postConstruct() {
        super.postConstruct();
        owner = ownerService.findByUsername(loginController.getRemoteUser());
    }

}
