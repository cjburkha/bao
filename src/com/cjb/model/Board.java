package com.cjb.model;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class Board {

    //Track each players board individually. Handle rotation in the printing.
    private BoardSide playerABoard;
    private BoardSide playerBBoard;


    public BoardSide getPlayerBBoard() {
        return playerBBoard;
    }

    public void setPlayerBBoard(BoardSide playerBBoard) {
        this.playerBBoard = playerBBoard;
    }

    public BoardSide getPlayerABoard() {
        return playerABoard;
    }

    public void setPlayerABoard(BoardSide playerABoard) {
        this.playerABoard = playerABoard;
    }

    public Board(boolean kiswahili) {
        this.playerABoard = new BoardSide(kiswahili);
        this.playerBBoard = new BoardSide(kiswahili);
    }
}
