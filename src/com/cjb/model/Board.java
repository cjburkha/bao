package com.cjb.model;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class Board {
    public static final boolean beginnerMode = false;
    //Track each players board individually. Handle rotation in the printing.
    public BoardSide playerABoard = new BoardSide(beginnerMode);
    public BoardSide playerBBoard = new BoardSide(beginnerMode);
}
