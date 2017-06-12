/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gasae.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author henrytrujillo
 */
@Entity
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e"),
    @NamedQuery(name = "Entrega.findByEntregacodigo", query = "SELECT e FROM Entrega e WHERE e.entregacodigo = :entregacodigo"),
    @NamedQuery(name = "Entrega.findByEntregafecha", query = "SELECT e FROM Entrega e WHERE e.entregafecha = :entregafecha"),
    @NamedQuery(name = "Entrega.findByEntregacantidad", query = "SELECT e FROM Entrega e WHERE e.entregacantidad = :entregacantidad")})
public class Entrega implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entregacodigo")
    private Integer entregacodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entregafecha")
    @Temporal(TemporalType.DATE)
    private Date entregafecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entregacantidad")
    private int entregacantidad;
    @JoinColumn(name = "tarjetacodigo", referencedColumnName = "tarjetacodigo")
    @ManyToOne(optional = false)
    private Tarjeta tarjetacodigo;
    @JoinColumn(name = "usuariocodigo", referencedColumnName = "usuariocodigo")
    @ManyToOne(optional = false)
    private Usuario usuariocodigo;

    public Entrega() {
    }

    public Entrega(Integer entregacodigo) {
        this.entregacodigo = entregacodigo;
    }

    public Entrega(Integer entregacodigo, Date entregafecha, int entregacantidad) {
        this.entregacodigo = entregacodigo;
        this.entregafecha = entregafecha;
        this.entregacantidad = entregacantidad;
    }

    public Integer getEntregacodigo() {
        return entregacodigo;
    }

    public void setEntregacodigo(Integer entregacodigo) {
        this.entregacodigo = entregacodigo;
    }

    public Date getEntregafecha() {
        return entregafecha;
    }

    public void setEntregafecha(Date entregafecha) {
        this.entregafecha = entregafecha;
    }

    public int getEntregacantidad() {
        return entregacantidad;
    }

    public void setEntregacantidad(int entregacantidad) {
        this.entregacantidad = entregacantidad;
    }

    public Tarjeta getTarjetacodigo() {
        return tarjetacodigo;
    }

    public void setTarjetacodigo(Tarjeta tarjetacodigo) {
        this.tarjetacodigo = tarjetacodigo;
    }

    public Usuario getUsuariocodigo() {
        return usuariocodigo;
    }

    public void setUsuariocodigo(Usuario usuariocodigo) {
        this.usuariocodigo = usuariocodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entregacodigo != null ? entregacodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.entregacodigo == null && other.entregacodigo != null) || (this.entregacodigo != null && !this.entregacodigo.equals(other.entregacodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gasae.model.Entrega[ entregacodigo=" + entregacodigo + " ]";
    }
    
}
