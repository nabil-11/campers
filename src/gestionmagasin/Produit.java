/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
modification.
 */
package gestionmagasin;

import tn.tuniprob.gestionmagasin.Employe;
import tn.tuniprob.gestionmagasin.Magasin;

/**
 *
 * @author Elife-Kef-050
 */
public class Produit {

    int ident;
    String libelle;
    String marque;
    private float prix;
    static int nbProduits;

    public int getIden() {
        return this.ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    // constructeur non parametrer
    Produit() {
        nbProduits++;
    }

    // Constructeur avec 3 parametres
    Produit(int ident, String libelle, String marque) {
        this.ident = ident;
        this.libelle = libelle;
        this.marque = marque;
        nbProduits++;
    }

    // Constructeur avec  4 parametres .
    Produit(int ident, String libelle, String marque, float prix) {
        this.ident = ident;
        this.libelle = libelle;
        this.marque = marque;
        if (prix > 0) {
            this.prix = prix;
        }
        nbProduits++;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix > 0) {
            this.prix = prix;
        }

    }

    // Methode pour afficher les produits .
    void afficher() {
        System.out.println("Les informations d'un produit : ");
        System.out.println("l'identifiant est : " + this.ident);
        System.out.println("Le type  est : " + this.libelle);
        System.out.println("Le marque est : " + this.marque);
        System.out.println("Le prix est : " + this.prix);

    }

    // Methode comparer qui compare deux produits 
    public boolean comparer(Produit p) {
        return (this.ident == p.ident) && (this.libelle == p.libelle) && (this.prix == p.prix);
//          if ((this.ident==p.ident)&&(this.libelle==p.libelle)&&(this.prix==p.prix))
//              return true ;
//        
//      return false ;
    }

    // la methode to string pour afficher les produits .
    @Override
    public String toString() {
        return "identifiant : " + this.ident + ", Libellé : " + this.libelle + ", Marque : " + this.marque + ", Prix : " + this.prix;

    }
   
}

