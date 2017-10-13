/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Scanner;

/**
 *
 * @author csnd2349
 */
public class Jeu421 {

    private De de1;
    private De de2;
    private De de3;
    private boolean trouve4;
    private boolean trouve2;
    private boolean trouve1;
    private int nbCoups;

    public Jeu421() {
        this.de1 = new De();
        this.de2 = new De();
        this.de3 = new De();
        this.nbCoups = 0;
        this.trouve4 = false;
        this.trouve2 = false;
        this.trouve1 = false;
    }

    public De getDe1() {
        return de1;
    }

    public void setDe1(De de1) {
        this.de1 = de1;
    }

    public De getDe2() {
        return de2;
    }

    public void setDe2(De de2) {
        this.de2 = de2;
    }

    public De getDe3() {
        return de3;
    }

    public void setDe3(De de3) {
        this.de3 = de3;
    }

    public boolean isTrouve4() {
        return trouve4;
    }

    public void setTrouve4(boolean trouve4) {
        this.trouve4 = trouve4;
    }

    public boolean isTrouve2() {
        return trouve2;
    }

    public void setTrouve2(boolean trouve2) {
        this.trouve2 = trouve2;
    }

    public boolean isTrouve1() {
        return trouve1;
    }

    public void setTrouve1(boolean trouve1) {
        this.trouve1 = trouve1;
    }

    public int getNbCoups() {
        return nbCoups;
    }

    public void setNbCoups(int nbCoups) {
        this.nbCoups = nbCoups;
    }

    public void jouer() {

        //lancer les dés
        this.de1.lancer();
        this.de2.lancer();
        this.de3.lancer();

        //Verifier la combinaison
        //4 parmis les dés
        if (de1.getValeur() == 4 || de2.getValeur() == 4 || de3.getValeur() == 4) {
            trouve4 = true;
        }
        //2 parmis les dés
        if (de1.getValeur() == 2 || de2.getValeur() == 2 || de3.getValeur() == 2) {
            trouve2 = true;
        }
        //1 parmis les dés
        if (de1.getValeur() == 1 || de2.getValeur() == 1 || de3.getValeur() == 1) {
            trouve1 = true;
        }

        while (!this.trouve1 || !this.trouve2 || !this.trouve4) {

            System.out.println(this);
            Scanner sc = new Scanner(System.in);
            System.out.println("Quel dé on relance ? ");
            int indDe = sc.nextInt();
            System.out.println("ok on relance le dé " + indDe);

            switch (indDe) {
                case 1:
                    this.de1.lancer();
                    break;
                case 2:
                    this.de2.lancer();
                    break;
                case 3:
                    this.de3.lancer();
                    break;
            }
            if (de1.getValeur() == 4 || de2.getValeur() == 4 || de3.getValeur() == 4) {
                trouve4 = true;
            }
            //2 parmis les dés
            if (de1.getValeur() == 2 || de2.getValeur() == 2 || de3.getValeur() == 2) {
                trouve2 = true;
            }
            //1 parmis les dés
            if (de1.getValeur() == 1 || de2.getValeur() == 1 || de3.getValeur() == 1) {
                trouve1 = true;
            }

            if (trouve1 && trouve2 && trouve4)
            {
                System.out.println("GAGNEEEEE !!!!!");
            }
        }
        

    }

    @Override
    public String toString() {
        return "d1= " + de1.getValeur() + "\nd2= " + de2.getValeur() + "\nd3= " + de3.getValeur();
    }

}
