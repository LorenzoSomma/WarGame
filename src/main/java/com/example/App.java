package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.gluonhq.maps.MapView;




/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static MapView worldMap;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainPage"), 1280, 720);
        stage.setScene(scene);
        stage.show();

        // da levare, QUESTA E' SOLO UNA PROVA

        worldMap = new MapView();
        worldMap.setZoom(1);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}