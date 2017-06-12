package com.gasae.model;

import com.gasae.model.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T17:27:53")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> clientecedula;
    public static volatile ListAttribute<Cliente, Tarjeta> tarjetaList;
    public static volatile SingularAttribute<Cliente, String> clientecodigo;
    public static volatile SingularAttribute<Cliente, String> clienteusuario;
    public static volatile SingularAttribute<Cliente, String> clienteapellido;
    public static volatile SingularAttribute<Cliente, String> clientedireccion;
    public static volatile SingularAttribute<Cliente, String> clientetelefono;
    public static volatile SingularAttribute<Cliente, String> clienteclave;
    public static volatile SingularAttribute<Cliente, String> clientenombre;

}