package com.example.battlemonkeys2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {
        Board board = new Board();
        Scene scene = new Scene(board);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Monkeys 2");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
