package com.cjb.model;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class BoardCell {
    public int getStones() {
        return stones;
    }

    public void setStones(int stones) {
        this.stones = stones;
    }


    public boolean isNyumba() {
        return isNyumba;
    }

    public void setNyumba(boolean isCenter) {
        this.isNyumba = isCenter;
    }

    //number of stones currently in this pit
    int stones;
    //4th pit from right on players front row
    //xxxxOxxx
    boolean isNyumba;
    //End pits
    //OxxxxxxO
    boolean isKichwa;
    //second to end pits
    //xOxxxxOx
    boolean isKimbi;




    public BoardCell(boolean isNyumba, boolean isKichwa, boolean isKimbi) {
        this.isKichwa = isKichwa;
        this.isKimbi = isKimbi;
        this.isNyumba = isNyumba;
    }

    public BoardCell(boolean isFrontRow, int rowPosition) {
        if (isFrontRow) {
            this.isNyumba = rowPosition == 4;
            this.isKichwa = rowPosition == 0 | rowPosition==7;
            this.isKimbi = rowPosition ==1 || rowPosition == 6;
        }
    }
}
