/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Graphisme;

import fr.insa.estherlou.Treilli.Treilli;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Esther-Lou Lutique
 */
public class Interface {
    
    private Treilli model;
    private BorderPane entete;
    private ZoneDessin dessin;
    private Label nom;
    private TextField nomEntree;
    private TextArea message;

    public Treilli getModel() {
        return model;
    }
    
    
}
