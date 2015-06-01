/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsf_kitap;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author MstfDryl
 */
@Entity
@NamedQuery(name="tumKitaplar", query="Select k From Kitap k")
public class Kitap implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable=false)
    private String adi;
    
    private Double fiyat;
    
    @Column(length=500)
    private String aciklama;
    
    private Integer sayfaSayisi;
    
    private String isbn;
    
    private String yazar;

    public Kitap() {
    }

    public Kitap(String adi, Double fiyat, String aciklama, Integer sayfaSayisi, String isbn, String yazar) {
        this.adi = adi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.sayfaSayisi = sayfaSayisi;
        this.isbn = isbn;
        this.yazar = yazar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
    
}
