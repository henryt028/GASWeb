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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsuariocodigo", query = "SELECT u FROM Usuario u WHERE u.usuariocodigo = :usuariocodigo"),
    @NamedQuery(name = "Usuario.findByUsuarionombre", query = "SELECT u FROM Usuario u WHERE u.usuarionombre = :usuarionombre"),
    @NamedQuery(name = "Usuario.findByUsuarioclave", query = "SELECT u FROM Usuario u WHERE u.usuarioclave = :usuarioclave"),
    @NamedQuery(name = "Usuario.findByUsuariorol", query = "SELECT u FROM Usuario u WHERE u.usuariorol = :usuariorol")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "usuariocodigo")
    private String usuariocodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "usuarionombre")
    private String usuarionombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "usuarioclave")
    private String usuarioclave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "usuariorol")
    private String usuariorol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariocodigo")
    private List<Entrega> entregaList;

    public Usuario() {
    }

    public Usuario(String usuariocodigo) {
        this.usuariocodigo = usuariocodigo;
    }

    public Usuario(String usuariocodigo, String usuarionombre, String usuarioclave, String usuariorol) {
        this.usuariocodigo = usuariocodigo;
        this.usuarionombre = usuarionombre;
        this.usuarioclave = usuarioclave;
        this.usuariorol = usuariorol;
    }

    public String getUsuariocodigo() {
        return usuariocodigo;
    }

    public void setUsuariocodigo(String usuariocodigo) {
        this.usuariocodigo = usuariocodigo;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public String getUsuarioclave() {
        return usuarioclave;
    }

    public void setUsuarioclave(String usuarioclave) {
        this.usuarioclave = usuarioclave;
    }

    public String getUsuariorol() {
        return usuariorol;
    }

    public void setUsuariorol(String usuariorol) {
        this.usuariorol = usuariorol;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuariocodigo != null ? usuariocodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuariocodigo == null && other.usuariocodigo != null) || (this.usuariocodigo != null && !this.usuariocodigo.equals(other.usuariocodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gasae.model.Usuario[ usuariocodigo=" + usuariocodigo + " ]";
    }
    
}
