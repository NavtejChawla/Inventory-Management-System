package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.security.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-22T11:42:49")
@StaticMetamodel(Customer.class)
public class Customer_ extends BaseEntity_ {

    public static volatile SingularAttribute<Customer, String> customerAddress;
    public static volatile SingularAttribute<Customer, Integer> customerId;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, User> user;

}