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
public class Responsable extends Employe {

    float prime;

    public Responsable(float prime, int ident, String nom, String adresse, float nb_heures) {
        super(ident, nom, adresse, nb_heures);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
    

    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}' + super.toString();
    }

    public float getSalaireEmploye() {
        float salaire = 0;
        float nbrHeureSup = 0;
        float nbrDeBase = 0;
        if (super.nb_heures > 160) {
            nbrHeureSup = super.nb_heures - 160;
            nbrDeBase = 160;
        } else {
            nbrHeureSup = 0;
            nbrDeBase = super.nb_heures;
        }
        salaire = (float) ((nbrDeBase * 10) + (10 * 1.2 * nbrHeureSup));
        salaire += prime;
        return salaire;
    }

}
