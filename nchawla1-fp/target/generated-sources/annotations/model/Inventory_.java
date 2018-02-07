package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Items;
import model.Storage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-22T11:42:49")
@StaticMetamodel(Inventory.class)
public class Inventory_ { 

    public static volatile SingularAttribute<Inventory, Long> itemId;
    public static volatile SingularAttribute<Inventory, Long> inventoryId;
    public static volatile SingularAttribute<Inventory, Integer> Quantity;
    public static volatile ListAttribute<Inventory, Storage> storage;
    public static volatile ListAttribute<Inventory, Items> items;

}