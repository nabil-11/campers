/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import tn.tuniprob.gestionmagasin.Employe;

/**
 *
 * @author Elife-Kef-068
 */
public class Caissier extends Employe {
    private int numeroDeCaisse ;

    public Caissier(int numeroDeCaissei ,int ident, String nom, String adresse, float nb_heures) {
        super(ident,nom,adresse,nb_heures) ;
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    

    @Override
    public String toString() {
        return "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}'+super.toString();
    }
    
    
      public float getSalaireEmploye() {
        float salaire = 0;
        float nbrHeureSup = 0;
        float nbrDeBase = 0;
        if (super.nb_heures > 180) {
            nbrHeureSup = super.nb_heures - 180;
            nbrDeBase = 180;
        } else {
            nbrHeureSup = 0;
            nbrDeBase = super.nb_heures;
        }
        salaire = (float) ((nbrDeBase * 10) + (10 * 1.15 * nbrHeureSup));
        return salaire;
    }
    
    
    
    
    
}
