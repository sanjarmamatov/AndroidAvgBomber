package com.example.user.myapplication;

import java.util.Arrays;

/**
 * Created by User on 17.08.2017.
 */

public class GameGrid {

    private int[][] gridArray;
    private String turn;
    private String message;

    public GameGrid(){
        gridArray = new int[2][2];
        fillArray();
    }

    private void fillArray() {
        Arrays.fill(gridArray[0], 0);
        Arrays.fill(gridArray[1], 0);
        gridArray[0][1] = 1;
        turn = "p1";
        message = "hodit p1";
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getContent(int x, int y){
        return gridArray[x][y];
    }

    public void setContent(int x, int y, int boom){
        gridArray[x][y] = boom;

    }

}
