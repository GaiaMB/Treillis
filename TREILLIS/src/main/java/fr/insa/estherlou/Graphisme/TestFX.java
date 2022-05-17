/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.estherlou.Graphisme;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Esther-Lou Lutique
 */
public class TestFX extends Application {
   
    @Override
    public void start(Stage stage) throws Exception {
        Interface main = new Interface();
        Scene sc = new Scene(main);
        stage.setScene(sc);
        stage.setTitle("CREA--TREILLI");
          stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
