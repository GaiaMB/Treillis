/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Treilli;
import fr.insa.estherlou.CommandeTerrain.BarreTerrain;

/**
 *
 * @author Esther-Lou Lutique
 */
public class NoeudAppui {
    
    private BarreTerrain barreTerrain;
    private double positionneur;
    private double nx;
    private double ny;
    
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
    
    public NoeudAppui ( BarreTerrain barreTerrain, double positionneur ){

        this.barreTerrain=barreTerrain;
        this.positionneur=positionneur;
    }
}
