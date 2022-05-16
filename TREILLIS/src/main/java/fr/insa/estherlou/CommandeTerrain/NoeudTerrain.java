/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.CommandeTerrain;

import fr.insa.estherlou.Treilli.Treilli;

/**
 *
 * @author Esther-Lou Lutique
 */
public class NoeudTerrain extends Treilli {
    
    private int nx;
    private int ny;

    public NoeudTerrain (int nx, int ny){

        this.nx=nx;
        this.ny=ny;
    }
    /**
     * @return the nx
     */
    public int getNx() {
        return nx;
    }

    /**
     * @param nx the nx to set
     */
    public void setNx(int nx) {
        this.nx = nx;
    }

    /**
     * @return the ny
     */
    public int getNy() {
        return ny;
    }

    /**
     * @param ny the ny to set
     */
    public void setNy(int ny) {
        this.ny = ny;
    }
    
}
