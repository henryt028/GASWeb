package com.gasae.model;

import com.gasae.model.Entrega;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T17:27:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> usuarionombre;
    public static volatile ListAttribute<Usuario, Entrega> entregaList;
    public static volatile SingularAttribute<Usuario, String> usuarioclave;
    public static volatile SingularAttribute<Usuario, String> usuariorol;
    public static volatile SingularAttribute<Usuario, String> usuariocodigo;

}