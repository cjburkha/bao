package com.cjb.model;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class BoardRow {
    public boolean isFrontRow() {
        return FrontRow;
    }

    public void setFrontRow(boolean frontRow) {
        FrontRow = frontRow;
    }

    boolean FrontRow;

    BoardCell rowCells[] = new BoardCell[8];

    public BoardRow(boolean frontRow) {
        FrontRow = frontRow;
        for (int i = 0; i<8; i++) {
            rowCells[i] = new BoardCell(this.FrontRow, i);
        }
    }

}
