/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsf_kitap;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MstfDryl
 */
@ManagedBean(name="bean")
@RequestScoped
public class KitapKontrolor {
    
    private Kitap kitap = new Kitap();
    
    @EJB
    private KitapEJB kitapEJB;
    
    private List<Kitap> kitapListesi = new ArrayList();
    
    public String kitapOlustur(){
       
        FacesContext context = FacesContext.getCurrentInstance();
            try
            {
                System.out.println("----------------------1----------------------------------------");
                kitap=kitapEJB.kitapEkle(kitap);
                System.out.println("----------------------2----------------------------------------");
                kitapListesi=kitapEJB.tumKitaplariBul();
                System.out.println("------------------------3--------------------------------------");
                context.addMessage(null, new FacesMessage("Ürün Sepete Eklendi..."));
                
                return "listele.xhtml";
            }
            catch(Exception e)
            {
                context.addMessage(null, new FacesMessage("Ürün Sepete Eklenirken Hata Oluştu..."));
                return null;
            }
            
        
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public List<Kitap> getKitapListesi() {
        return kitapListesi;
    }

    public void setKitapListesi(List<Kitap> kitapListesi) {
        this.kitapListesi = kitapListesi;
    }
    
}
