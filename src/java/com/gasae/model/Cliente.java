/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gasae.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author henrytrujillo
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClientenombre", query = "SELECT c FROM Cliente c WHERE c.clientenombre = :clientenombre"),
    @NamedQuery(name = "Cliente.findByClienteapellido", query = "SELECT c FROM Cliente c WHERE c.clienteapellido = :clienteapellido"),
    @NamedQuery(name = "Cliente.findByClientecedula", query = "SELECT c FROM Cliente c WHERE c.clientecedula = :clientecedula"),
    @NamedQuery(name = "Cliente.findByClientecodigo", query = "SELECT c FROM Cliente c WHERE c.clientecodigo = :clientecodigo"),
    @NamedQuery(name = "Cliente.findByClientedireccion", query = "SELECT c FROM Cliente c WHERE c.clientedireccion = :clientedireccion"),
    @NamedQuery(name = "Cliente.findByClientetelefono", query = "SELECT c FROM Cliente c WHERE c.clientetelefono = :clientetelefono"),
    @NamedQuery(name = "Cliente.findByClienteusuario", query = "SELECT c FROM Cliente c WHERE c.clienteusuario = :clienteusuario"),
    @NamedQuery(name = "Cliente.findByClienteclave", query = "SELECT c FROM Cliente c WHERE c.clienteclave = :clienteclave")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clientenombre")
    private String clientenombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clienteapellido")
    private String clienteapellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "clientecedula")
    private String clientecedula;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "clientecodigo")
    private String clientecodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "clientedireccion")
    private String clientedireccion;
    @Size(max = 10)
    @Column(name = "clientetelefono")
    private String clientetelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clienteusuario")
    private String clienteusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clienteclave")
    private String clienteclave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientecodigo")
    private List<Tarjeta> tarjetaList;

    public Cliente() {
    }

    public Cliente(String clientecodigo) {
        this.clientecodigo = clientecodigo;
    }

    public Cliente(String clientecodigo, String clientenombre, String clienteapellido, String clientecedula, String clientedireccion, String clienteusuario, String clienteclave) {
        this.clientecodigo = clientecodigo;
        this.clientenombre = clientenombre;
        this.clienteapellido = clienteapellido;
        this.clientecedula = clientecedula;
        this.clientedireccion = clientedireccion;
        this.clienteusuario = clienteusuario;
        this.clienteclave = clienteclave;
    }

    public String getClientenombre() {
        return clientenombre;
    }

    public void setClientenombre(String clientenombre) {
        this.clientenombre = clientenombre;
    }

    public String getClienteapellido() {
        return clienteapellido;
    }

    public void setClienteapellido(String clienteapellido) {
        this.clienteapellido = clienteapellido;
    }

    public String getClientecedula() {
        return clientecedula;
    }

    public void setClientecedula(String clientecedula) {
        this.clientecedula = clientecedula;
    }

    public String getClientecodigo() {
        return clientecodigo;
    }

    public void setClientecodigo(String clientecodigo) {
        this.clientecodigo = clientecodigo;
    }

    public String getClientedireccion() {
        return clientedireccion;
    }

    public void setClientedireccion(String clientedireccion) {
        this.clientedireccion = clientedireccion;
    }

    public String getClientetelefono() {
        return clientetelefono;
    }

    public void setClientetelefono(String clientetelefono) {
        this.clientetelefono = clientetelefono;
    }

    public String getClienteusuario() {
        return clienteusuario;
    }

    public void setClienteusuario(String clienteusuario) {
        this.clienteusuario = clienteusuario;
    }

    public String getClienteclave() {
        return clienteclave;
    }

    public void setClienteclave(String clienteclave) {
        this.clienteclave = clienteclave;
    }

    @XmlTransient
    public List<Tarjeta> getTarjetaList() {
        return tarjetaList;
    }

    public void setTarjetaList(List<Tarjeta> tarjetaList) {
        this.tarjetaList = tarjetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientecodigo != null ? clientecodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientecodigo == null && other.clientecodigo != null) || (this.clientecodigo != null && !this.clientecodigo.equals(other.clientecodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gasae.model.Cliente[ clientecodigo=" + clientecodigo + " ]";
    }
    
}
