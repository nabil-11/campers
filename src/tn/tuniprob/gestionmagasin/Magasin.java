/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import gestionmagasin.Produit;

/**
 *
 * @author Elife-Kef-050
 */
public class Magasin {

    private int id;
    private String adresse;
    private int cpacite_magasin;
    private final int CAPA_MAX = 50;
    private Produit[] produits;
    static int nbMagasins;
    final int CAPA_EMPLOYE = 20;
    Employe[] employes = new Employe[CAPA_EMPLOYE];
    private String nom;
    int nbEmploye;

    public Magasin() {
        this.produits = new Produit[CAPA_MAX];

    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        produits = new Produit[CAPA_MAX];

    }

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        produits = new Produit[CAPA_MAX];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCpacite_magasin() {
        return cpacite_magasin;
    }

    public void setCpacite_magasin(int cpacite_magasin) {
        this.cpacite_magasin = cpacite_magasin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Methode pour ajouter un produit n'existe pas dans le magasin 
    public void ajouterProduit(Produit p) {
        if ((cpacite_magasin < CAPA_MAX)) {
            if (!(this.chercher(p))) {
                this.produits[this.cpacite_magasin] = p;
                cpacite_magasin++;
                nbMagasins++;
            } else {
                System.out.println("Le produit existe déja");
            }
        } else {
            System.out.println("Le tableau est plein");
        }
    }

    // Methode pour afficher tous les produits d'un magasin
    public void afficher() {
        String str = "Le Magasin de id :  " + this.id + " l'adresse : " + this.adresse + " Nom : " + this.nom + " / les produits : [ \n";
        for (int i = 0; i < cpacite_magasin; i++) {

            str += produits[i].getLibelle() + ", " + produits[i].getPrix() + "\n";
        }
        System.out.println(str + "]");

    }

    // Methode comparer qui compare deux produits pass en paramétre.
    public boolean comparer(Produit p1, Produit p2) {
        return (p1.getLibelle() == p2.getLibelle()) && (p1.getIden() == p2.getIden()) && (p1.getPrix() == p2.getPrix());

//      if((p1.getLibelle()== p2.getLibelle()) && (p1.getIden()==p2.getIden()) && (p1.getPrix()==p2.getPrix()))   
//            {    return true ;
//            }
//      return false ;
    }

    // Methode qui cherché un produit dans um magasin.
    public boolean chercher(Produit p) {
        for (int i = 0; i < cpacite_magasin; i++) {
            if (this.comparer(this.produits[i], p)) {
                return true;
            }
        }
        return false;
    }

    // Methode pour supprimer un produit. 
    public boolean supprimer(Produit p) {
        int index = -1;
        for (int i = 0; i < cpacite_magasin; i++) {
            if (this.comparer(produits[i], p)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            if (index == 49) {
                this.produits[index] = null;
                return true;
            }
            for (int i = index; i < produits.length - 1; i++) {
                produits[i] = produits[i + 1];
            }
            cpacite_magasin--;
            return true;
        }
        return false;
    }

    public void ajouterEmployer(Employe e) {
        this.employes[nbEmploye] = e;
        nbEmploye++;
    }

    public void afficherEmploye() {
        for (int i = 0; i < this.nbEmploye; i++) {
            System.out.println(employes[i]);
        }
    }

    public void AfficherSalaire() {
        for (int i = 0; i < this.nbEmploye; i++) {
            System.out.println(employes[i].getSalaireEmploye());
        }
    }

    public void afficherSalireEmp() {
        for (int i = 0; i < this.nbEmploye; i++) {
            if (this.employes[i] instanceof Responsable) {
                float salaire = 0;
                final Responsable R = (Responsable) this.employes[i];

                if (R.getNb_heures() <= 160) {
                    salaire = 160 * 10 * R.getPrime();
                }
                if (R.getNb_heures() > 160) {
                    salaire = 160 * 10;
                    float diff = R.getNb_heures() - 160;
                    salaire += diff * 12;
                    salaire += R.getPrime();
                }

                System.out.println("Le Responsable " + R.getNom() + " est de salaire " + salaire);

            }

            if (this.employes[i] instanceof Caissier) {
                float salaire = 0;
                final Caissier c = (Caissier) this.employes[i];

                if (c.getNb_heures() <= 180) {
                    salaire = 180 * 5;
                }
                if (c.getNb_heures() > 180) {
                    salaire = 180 * 5;
                    float diff = c.getNb_heures() - 180;
                    salaire += diff * 5.75f;

                }

                System.out.println("Le Caissier " + c.getNom() + " est de salaire " + salaire);

            }

            if (this.employes[i] instanceof Vendeur) {
                float salaire = 450;
                final Vendeur v = (Vendeur) this.employes[i];

                salaire = (450 * v.getTauxDeVente()) / 100;

                System.out.println("Le Vendeur " + v.getNom() + " est de salaire " + salaire);

            }
        }
    }

    public void affichePrimeResponsable() {
        for (int i = 0; i < this.nbEmploye; i++) {
            if (employes[i] instanceof Responsable) {
                Responsable R = (Responsable) this.employes[i];
                System.out.println("Le prime de " + R.getNom() + " est : " + R.getPrime());

            }
        }

    }

    public void nbEmployes() {
        int nbResponsable = 0;
        int nbVendeur = 0;
        int nbCaissier = 0;

        for (int i = 0; i < this.nbEmploye; i++) {
            if (employes[i] instanceof Responsable) {
                nbResponsable++;
            }
            if (employes[i] instanceof Vendeur) {
                nbVendeur++;
            }
            if (employes[i] instanceof Caissier) {
                nbCaissier++;
            }
        }
        System.out.println("Le nombres des responsables est " + nbResponsable);
        System.out.println("Le nombres des vendeurs est " + nbVendeur);
        System.out.println("Le nombres des caissiers est " + nbCaissier);

    }

}
