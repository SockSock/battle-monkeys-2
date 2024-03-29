package com.example.battlemonkeys2;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tile extends StackPane {

    private static final double TILE_SIZE = 50; // Adjust the size of each tile as needed
    private final int row;
    private final int col;
    private final Monkey monkey;
    private final Rectangle border;
    private final Circle monkeyCircle;

    public Tile(int row, int col, Monkey monkey) {
        this.row = row;
        this.col = col;
        this.monkey = monkey;

        border = new Rectangle(TILE_SIZE, TILE_SIZE);
        border.setFill(null);
        border.setStroke(Color.BLACK);

        monkeyCircle = new Circle(TILE_SIZE / 2, Color.BROWN);
        monkeyCircle.setVisible(false);

        setOnMouseClicked(event -> {
            // Define the action to be performed when the tile is clicked
            System.out.println("Tile clicked: Row " + row + ", Column " + col);
            monkey.move(row, col);
        });

        getChildren().addAll(border, monkeyCircle);
    }

    public void showMonkey() {
        monkeyCircle.setVisible(true);
    }

    public void hideMonkey() {
        monkeyCircle.setVisible(false);
    }
}
