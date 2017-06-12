/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gasae.beans;

import com.gasae.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author henrytrujillo
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "GASAEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    @Override
    public Usuario iniciarSecion(Usuario us){
        Usuario usuario = null;
        String consulta;
        try{
            consulta = "FROM USUARIO u WHERE u.usuarionombre=?1 AND u.usuarioclave=?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, us.getUsuarionombre());
            query.setParameter(2, us.getUsuarioclave());
            List<Usuario> lista = query.getResultList();
            if(!lista.isEmpty()){
                usuario = lista.get(0);
            }
        }catch(Exception e){
            throw e;
        }finally{
            //em.close();
        }
        return usuario;
    }
}
