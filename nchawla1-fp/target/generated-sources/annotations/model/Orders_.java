package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-22T11:42:49")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Long> orderNumber;
    public static volatile SingularAttribute<Orders, Date> dateCompleted;
    public static volatile SingularAttribute<Orders, Date> dateRequested;

}