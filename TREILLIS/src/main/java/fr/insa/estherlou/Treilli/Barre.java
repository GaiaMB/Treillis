/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Treilli;

import fr.insa.estherlou.Treilli.Treilli;
import static java.lang.Math.PI;

/**
 *
 * @author Esther-Lou Lutique
 */
public class Barre {
 
    private int identifiant;
    private Noeud noeudDepart;
    private Noeud noeudArriv;
    private double tractionMax;
    private double compressionMax;
    private double prixAuM;  
    
    
    public Barre (int identifiant, Noeud noeudDepart, Noeud noeudArriv){
        this.identifiant=identifiant;
        this.noeudDepart=noeudDepart;
        this.noeudArriv=noeudArriv;
    }
    
    @Override
    public String toString (){
        return ("[ Barre "+this.getIdentifiant()+" de:"+this.noeudDepart+" à "+this.noeudArriv+"]");
    } 
    
    public void noeudOppose ( Barre b, Noeud n){
        if (n==this.noeudDepart){
            System.out.println("Le noeud oppose est: [ Noeud "+noeudArriv.getIdentifiant()+" en:"+noeudArriv.getNx()+","+noeudArriv.getNy()+"]");
        }
        else{
            if (n==this.noeudArriv){
                System.out.println("Le noeuid oppose est: [ Noeud "+noeudDepart.getIdentifiant()+" en:"+noeudDepart.getNx()+","+noeudDepart.getNy()+"]");
            }
            else{
                System.out.println("Mauvaise entrée");
            }
        }
    }
    
    
    public double Angle (Noeud n, Barre b) {
        Noeud m;
        // TODO
        m = null;
  //      m= noeudOppose(b, n);
        
        double A;
        double B;
        double angle;
        angle=0;
        A= n.getNx()-m.getNx();
        B= n.getNy()-m.getNy();
        
        if (A!=0){
            angle= Math.atan2(B, A);
            if (angle<0){
                angle= angle+PI;
            }
        }
        else {
            System.out.println("Error");
        }
        return 0;
    }
    
    
    public int getIdentifiant () {
        return identifiant;
    }
    
    public double getTractionMax(){
        return this.tractionMax;
    }
    public void setTractionMax (double tM){
        this.tractionMax=tM;
    }
    
    public double getCompressionMax(){
        return this.compressionMax;
    }
    public void setCompressionMax (double cM){
        this.compressionMax=cM;
    }
    
    public double getPrixAuM(){
        return this.prixAuM;
    }
    
    
    public Noeud getNoeudDepart(){
        return this.noeudDepart;
    }
    public void setNoeudDepart (Noeud noeudDepart){
        this.noeudDepart=noeudDepart;
    }
    
    
    public Noeud getNoeudArriv(){
        return this.noeudArriv;
    }
    public void setNoeudArriv (Noeud noeudArriv){
        this.noeudArriv=noeudArriv;
    }
    
    
}
