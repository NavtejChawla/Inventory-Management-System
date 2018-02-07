package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.security.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-22T11:42:49")
@StaticMetamodel(Owner.class)
public class Owner_ { 

    public static volatile SingularAttribute<Owner, String> address;
    public static volatile SingularAttribute<Owner, String> city;
    public static volatile SingularAttribute<Owner, String> telephone;
    public static volatile SingularAttribute<Owner, Integer> ownerId;
    public static volatile SingularAttribute<Owner, User> user;

}