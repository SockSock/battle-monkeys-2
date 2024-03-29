package com.example.battlemonkeys2;

import javafx.scene.layout.GridPane;

public class Board extends GridPane {

    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 13;
    private final Monkey monkey;

    public Board() {
        monkey = new Monkey(this);

        // Set up the grid
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Tile tile = new Tile(row, col, monkey);
                add(tile, col, row);
            }
        }

        // Place the monkey at the initial position
        placeMonkey(NUM_ROWS / 2, NUM_COLS / 2);
    }

    public void placeMonkey(int row, int col) {
        Tile tile = (Tile) getChildren().get(row * NUM_COLS + col);
        tile.showMonkey();
    }

    public void clearMonkey(int row, int col) {
        Tile tile = (Tile) getChildren().get(row * NUM_COLS + col);
        tile.hideMonkey();
    }
}
