package com.gasae.model;

import com.gasae.model.Cliente;
import com.gasae.model.Entrega;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T17:27:53")
@StaticMetamodel(Tarjeta.class)
public class Tarjeta_ { 

    public static volatile SingularAttribute<Tarjeta, Date> tarjetafechaemision;
    public static volatile SingularAttribute<Tarjeta, Integer> tarjetacupoasignado;
    public static volatile ListAttribute<Tarjeta, Entrega> entregaList;
    public static volatile SingularAttribute<Tarjeta, Cliente> clientecodigo;
    public static volatile SingularAttribute<Tarjeta, String> tarjetacodigo;
    public static volatile SingularAttribute<Tarjeta, Date> tarjetafechavencimiento;
    public static volatile SingularAttribute<Tarjeta, Boolean> tarjetaactiva;
    public static volatile SingularAttribute<Tarjeta, Integer> tarjetanumerointegrantes;

}