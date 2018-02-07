package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Inventory;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-22T11:42:49")
@StaticMetamodel(Storage.class)
public class Storage_ { 

    public static volatile SingularAttribute<Storage, Long> sno;
    public static volatile SingularAttribute<Storage, String> name;
    public static volatile ListAttribute<Storage, Inventory> inventory;

}