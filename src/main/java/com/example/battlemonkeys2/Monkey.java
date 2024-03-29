package com.example.battlemonkeys2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Monkey {

    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 13;
    private int currentRow;
    private int currentCol;
    private final Board board;

    public Monkey(Board board) {
        this.board = board;
        // Initialize the monkey's position
        currentRow = NUM_ROWS / 2;
        currentCol = NUM_COLS / 2;
    }

    public void move(int targetRow, int targetCol) {
        // Calculate the absolute difference between the current position and the target position
        int rowDiff = Math.abs(targetRow - currentRow);
        int colDiff = Math.abs(targetCol - currentCol);

        // Check if the target position is within the allowed range (5x5 box)
        if (rowDiff <= 2 && colDiff <= 2) {
            System.out.println("Monkey moves to: Row " + targetRow + ", Column " + targetCol);
            board.clearMonkey(currentRow, currentCol);
            currentRow = targetRow;
            currentCol = targetCol;
            board.placeMonkey(currentRow, currentCol);
        } else {
            System.out.println("Target position is out of range for the monkey.");
        }
    }
}
