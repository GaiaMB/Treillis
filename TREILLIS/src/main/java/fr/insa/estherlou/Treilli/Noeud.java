/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Treilli;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Esther-Lou Lutique
 */
public class Noeud extends Treilli {
    
    private int identifiant;
    private double nx;
    private double ny;
    private List<Barre> barresDepart;   // Ensemble des barres dont le nœud est le départ
    private List<Barre> barresArrivee;  // même principe
    
    public Noeud (int identifiant, double nx, double ny) {
        this.nx=nx;
        this.ny=ny;
        this.identifiant=identifiant;
    }
    
    
    public double getNx() {                         //  nx
        return this.nx;
    }
    
    public void setNx (double nx) {
        this.nx=nx;
    }
    
    public double getNy() {                         //   nx
        return this.ny;
    }
    
    public void setNy (double ny) {
        this.ny=ny;
    }
    
    public int getIdentifiant () {
        return identifiant;
    }
    
    public List<Barre> getBarresDepart(){
        return this.barresDepart;
    }
    
    public List<Barre> getBarresArrivee(){
        return this.barresArrivee;
    }
    
    
    
      
    @Override
    public String toString (){
        return ("[ Noeud "+this.getIdentifiant()+" en:"+this.getNx()+","+this.getNy()+"]");
    }
    
    
}
