/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Navtej
 */
@Named
@RequestScoped
public class LoginController extends BaseController {

    Logger LOG =Logger.getLogger(LoginController.class.getName());
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

    public LoginController() {
    }

    @PostConstruct
    protected void postConstruct() {
        super.postConstruct();
    }

    public String doLogin() {
        try {
            HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();
            req.login(username, password);
        } catch (ServletException ex) {
            LOG.warning("login failed: " + username);
            LOG.log(Level.SEVERE, null, ex);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong login credentials", "Wrong Login Detail"));
            return "/login.xhtml";
        }

        return conditionalizeContextPath("welcome.xhtml");
    }

    private String conditionalizeContextPath(String intent) {
        if (isCustomer()) {
            return "/customer/" + intent;
        } else if (isOwner()) {
            return "/owner/" + intent;
        } else {
            return intent;
        }
    }

    public boolean isCustomer() {
        return context.getExternalContext().isUserInRole("vet");
    }

    public boolean isOwner() {
        return context.getExternalContext().isUserInRole("owner");
    }

    public String getRemoteUser() {
        return context.getExternalContext().getRemoteUser();
    }

    public String doLogout() {
        return "logout.xhtml";
    }

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
