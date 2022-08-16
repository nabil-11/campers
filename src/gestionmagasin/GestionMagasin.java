/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

import tn.tuniprob.gestionmagasin.Caissier;
import tn.tuniprob.gestionmagasin.Employe;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Responsable;
import tn.tuniprob.gestionmagasin.Vendeur;

/**
 *
 * @author Elife-Kef-050
 */
public class GestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creation de la premiere produit.
        Produit p = new Produit(1021, "Lait", "Delice");
        // Creation de la deuxieme produit
        Produit p1 = new Produit(2510, "Yaourt", "Vitalait");
        // Creation de la 3eme produity
        Produit p2 = new Produit(3250, "Tomate", "Sicam", (float) 1.200);

        Produit p3 = new Produit(3255, "Tomate", "Sicam", (float) 1.200);
        // Affichage de la premiere produit
        p.afficher();
        System.out.println("--------------------------");
        // Affichage de le 2eme produit 
        p1.afficher();
        System.out.println("--------------------------");
        // Affichage de la 3eme produit
        p2.afficher();
        // Attribuer le prix a la produit 1
        p1.setPrix((float) 0.70);
        System.out.println("--------------------------");
        // Affichage de la premiere produit apres la modification 
        p.afficher();
        // Attribuer le prix a la produit 2
        p1.setPrix((float) 0.50);
        System.out.println("--------------------------");
        // Affichage de la deuxieme produit apres la modification 
        p1.afficher();
        System.out.println("--------------------------");
        // Affichage des produits d'apres la ,methode to string.
        System.out.println("Affichage d'apres la methode to string : ");
        System.out.println(p.toString());
        System.out.println("--------------------------");
        System.out.println(p1.toString());
        System.out.println("--------------------------");
        System.out.println(p2.toString());

        Magasin aziza = new Magasin(1, "El kef");
        aziza.ajouterProduit(p);
        aziza.ajouterProduit(p1);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(32, "filfil", "7ar", (float) 3.200));
        System.out.println(p.comparer(p2));
        System.out.println(aziza.comparer(p1, p2));

        aziza.afficher();
        System.out.println("--------------------------");
        System.out.println("Le nombre totale de tous les produits est : " + Produit.nbProduits);

        Magasin monoprix = new Magasin(2, "Tunis");
        monoprix.ajouterProduit(new Produit(50, "tmatm", "7low", (float) 4.200));
        monoprix.ajouterProduit(new Produit(60, "ma9rouna", "fil", (float) 1.200));
        if (p2.comparer(p3)) {
            System.out.println("Les deux produits sont identiques");
        } else {
            System.out.println("les deux produits sont differentes ");

        }
        System.out.println("------------");

        Magasin carrefour = new Magasin(2, "Carrefour", "centre-ville");
        Magasin monoprix1 = new Magasin(3, "Monoprix", "Menzah 6");

        Caissier CaissierCarrefour1 = new Caissier(1, 123, "Oussama", "El kef", 36);
        Caissier CaissierCarrefour2 = new Caissier(2, 1234, "Mohamed", "Tunis", 40);
        Vendeur VendeurCarrefour = new Vendeur(10, 12345, "Amir", "soussa", 45);
        Responsable ResponsableCarrefour = new Responsable(500, 12, "Ahmed", "Jendouba", 25);

        Caissier CaissierMonoprix = new Caissier(3, 123456, "mahdi", "El kef", 37);
        Vendeur VendeurMonoprix1 = new Vendeur(4, 1234567, "anas", "beja", 43);
        Vendeur VendeurMonoprix2 = new Vendeur(5, 12345678, "ahmed", "nabeul", 44);
        Vendeur VendeurMonoprix3 = new Vendeur(6, 123456, "hosni", "gasserine", 49);
        Responsable ResponsableMonoprix = new Responsable(450, 13, "issam", "bizerte", 35);

        System.out.println(CaissierCarrefour1.toString());
        System.out.println(CaissierCarrefour2.toString());
        System.out.println(VendeurCarrefour.toString());
        System.out.println(ResponsableCarrefour.toString());
        System.out.println(CaissierMonoprix.toString());
        System.out.println(VendeurMonoprix1.toString());
        System.out.println(VendeurMonoprix2.toString());
        System.out.println(VendeurMonoprix3.toString());
        System.out.println(ResponsableMonoprix.toString());

        Produit p4 = new Produit(3000, "ma9rouna", "fil", (float) 0.500);
        Produit p5 = new Produit(2900, "roz", "asfer", (float) 2.900);
        Produit p6 = new Produit(2800, "khobz", "baguette", (float) 0.200);
        Produit p7 = new Produit(3250, "Pril", "kbir", (float) 7.200);
        monoprix1.ajouterProduit(p4);
        monoprix1.ajouterProduit(p5);
        carrefour.ajouterProduit(p6);
        carrefour.ajouterProduit(p7);
        System.out.println("-----Affichage monoprix 1------ ");
        monoprix1.afficher();
        System.out.println("-----Afficher carrefour --------");
        carrefour.afficher();
        carrefour.ajouterEmployer(CaissierCarrefour1);
        carrefour.ajouterEmployer(CaissierCarrefour2);
        carrefour.ajouterEmployer(VendeurCarrefour);
        carrefour.ajouterEmployer(ResponsableCarrefour);

        monoprix1.ajouterEmployer(CaissierMonoprix);
        monoprix1.ajouterEmployer(VendeurMonoprix1);
        monoprix1.ajouterEmployer(VendeurMonoprix2);
        monoprix1.ajouterEmployer(VendeurMonoprix3);
        monoprix1.ajouterEmployer(ResponsableMonoprix);
        System.out.println("------Affichage Employees de la magasin monoprix1-------");
        monoprix1.afficherEmploye();
        System.out.println("Affichage des employees de la magasin carrefour-------- ");
        carrefour.afficherEmploye();

        System.out.println("SALAIRE ResponsableCarrefour :" + ResponsableCarrefour.getSalaireEmploye());

        System.out.println("SALAIRE ResponsableMonoprix :" + ResponsableMonoprix.getSalaireEmploye());

        System.out.println("SALAIRE CaissierCarrefour1 :" + CaissierCarrefour1.getSalaireEmploye());

        System.out.println("SALAIRE CaissierMonoprix :" + CaissierMonoprix.getSalaireEmploye());

        System.out.println("SALAIRE VendeurCarrefour :" + VendeurCarrefour.getSalaireEmploye());

        System.out.println("SALAIRE VendeurMonoprix1 :" + VendeurMonoprix1.getSalaireEmploye());
        System.out.println("------------Affichage salaire employees------------");
        
        
        carrefour.AfficherSalaire();
        
        System.out.println("-------Affichage Prime Responsable --------");
        
        carrefour.affichePrimeResponsable();
        
        
        System.out.println("------Afficher le nombre des employés par type-----");
        
        carrefour.nbEmployes();
        
        
        System.out.println("----afficherSalireEmp----");
        
        carrefour.afficherSalireEmp();
        
        
        Employe e = new Responsable(500, 12, "Ahmed", "Jendouba", 25) ;
        Employe e1 = new Responsable(500, 12, "Ahmed", "Jendouba", 25) ;
        
        System.out.println(e.equals(e1));
        

    }

}
