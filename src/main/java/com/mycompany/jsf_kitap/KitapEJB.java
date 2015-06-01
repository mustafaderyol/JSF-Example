/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsf_kitap;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author MstfDryl
 */
@Stateless
public class KitapEJB {
    
    @PersistenceContext(name="Kitap.Data")
    private EntityManager em;
  
    public List<Kitap> tumKitaplariBul(){
        
        TypedQuery<Kitap> sorgu = em.createNamedQuery("tumKitaplar", Kitap.class);
        return sorgu.getResultList();
    }
    
    public Kitap kitapEkle(Kitap kitap){
       
        em.persist(kitap);
        return kitap;
    }
    
}
