package it.unibo.javafx.property;

import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.beans.EventHandler;

public class App extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Controls Exercise!");

        //Componenti
        final Counter counter = new Counter();
        final Label counterLbl = new Label();
        counterLbl.textProperty().bind(counter.counterProperty().asString());
        final Button btnIncrease = new Button("+");
        btnIncrease.setOnMouseClicked((e)-> {counter.increment();
        });
        final Button btnDecrease = new Button("-");
        btnDecrease.setOnMouseClicked((e)-> {counter.decrement();
        });

        // TODO aggiungere gli elementi come descritto da readme

        //Stage
        final VBox mainPane = new VBox();
        final HBox buttonsPane = new HBox();
        mainPane.getChildren().addAll(counterLbl,buttonsPane);
        buttonsPane.getChildren().addAll(btnIncrease,btnDecrease);
        btnIncrease.setMinWidth(100);
        btnDecrease.setMinWidth(100);


        //Setup finale
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }

    public static class Main {
        static void main(final String... args) {
            Application.launch(App.class, args);
        }
    }
}
