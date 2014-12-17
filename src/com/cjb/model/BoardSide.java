package com.cjb.model;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class BoardSide {

    public BoardRow frontRow;
    public BoardRow backRow;

    public BoardSide(boolean beginnerMode) {
        this.frontRow = new BoardRow(true,beginnerMode);
        this.backRow = new BoardRow(false,beginnerMode);
    }
}
