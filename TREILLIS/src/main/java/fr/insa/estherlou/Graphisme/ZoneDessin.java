/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Graphisme;

import fr.insa.estherlou.Treilli.Treilli;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
/**
 *
 * @author Esther-Lou Lutique
 */
public class ZoneDessin extends Pane{
        
    private Interface main;
    
    public ZoneDessin(Interface main) {
        this.main = main;
        this.redessineTout();
    }
    
    public void redessineTout() {
        this.getChildren().clear();
        Treilli t = this.main.getModel();
        // pour chaque noeud du treilli
        // dessine le noeud
        // ci dessous FAUX : faire un cercle par noeud et 
        // au bon endroid
        Circle c = new Circle(10, 20, 5);
        this.getChildren().add(c);
    }
    
}
