/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gasae.controller;

import com.gasae.beans.UsuarioFacade;
import com.gasae.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author henrytrujillo
 */
@Named
@ViewScoped
public class LoginController implements Serializable{
    
    private UsuarioFacade EJBUsuario;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario prepareVerify() {
        usuario = new Usuario();
        
        return usuario;
    }
    
    public String iniciarSecion(){
        String redireccion = null;
        Usuario us;
        try{
            us = EJBUsuario.iniciarSecion(usuario);
            if (us !=null){
                redireccion = "/inicio";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso","Datos incorrectos."));
            }
            
        }catch(Exception e){
            //
        }
        return  redireccion;
    }
    
}
