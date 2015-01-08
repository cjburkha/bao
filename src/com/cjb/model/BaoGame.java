package com.cjb.model;

import sun.security.util.Debug;

/**
 * Created by chrisb on 12/17/14.
  */
public class BaoGame {
    public boolean isKiswahili() {
        return kiswahili;
    }

    public void setKiswahili(boolean kiswahili) {
        this.kiswahili = kiswahili;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private boolean kiswahili = false;
    private Board board;
    private Debug d = new Debug();



/*    protected BaoGame()
    {
        //default constructor
        System.out.println("default");
    }*/
    protected BaoGame(boolean kiswahili) {
        System.out.println("overload");
        this.setKiswahili(kiswahili);
        this.board = new Board(this.isKiswahili());

    }
}
