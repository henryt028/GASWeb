package com.gasae.model;

import com.gasae.model.Tarjeta;
import com.gasae.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T17:27:53")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile SingularAttribute<Entrega, Date> entregafecha;
    public static volatile SingularAttribute<Entrega, Tarjeta> tarjetacodigo;
    public static volatile SingularAttribute<Entrega, Usuario> usuariocodigo;
    public static volatile SingularAttribute<Entrega, Integer> entregacodigo;
    public static volatile SingularAttribute<Entrega, Integer> entregacantidad;

}