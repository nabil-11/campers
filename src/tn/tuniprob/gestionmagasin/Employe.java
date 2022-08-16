/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Elife-Kef-068
 */
public abstract class Employe {

    public int ident;
    public String nom;
    protected String adresse;
    protected float nb_heures;
// Constructeur  avec 4 paramétres 

    public Employe(int ident, String nom, String adresse, float nb_heures) {
        this.ident = ident;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
    }

    @Override
    public String toString() {
        return "Employe{" + "ident=" + ident + ", nom=" + nom + ", adresse=" + adresse + ", nb_heures=" + nb_heures + '}';
    }

    public float getNb_heures() {
        return nb_heures;
    }

    public void setNb_heures(float nb_heures) {
        this.nb_heures = nb_heures;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
     public boolean equals(Object obj){
         if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Employe) {
          final  Employe e = (Employe) obj;
            if ((e.ident == this.ident) && (this.nom.equals(e.nom))) {
                return true;
            }

        }
        return false ;
     }
    

    public abstract float getSalaireEmploye();

}
