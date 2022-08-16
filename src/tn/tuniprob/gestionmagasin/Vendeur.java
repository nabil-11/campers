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
public class Vendeur extends Employe {

    float tauxDeVente;

    public Vendeur(float tauxDeVente, int ident, String nom, String adresse, float nb_heures) {
        super(ident, nom, adresse, nb_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}' + super.toString();
    }

    public float getSalaireEmploye() {
        float salaire = 0;

        salaire = (450 * (tauxDeVente / 100)) + 450;

        return salaire;
    }

}
