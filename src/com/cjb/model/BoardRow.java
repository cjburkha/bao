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




    private boolean FrontRow;

    public BoardPit Pits[] = new BoardPit[8];

    //Pretty sure this is the right way to do it.
    //Each row is position or direction agnostic. that way each pit can tell if it is the nyumba
    //Makes printing and comparing a bit harder, but it is more accurate.
    //Pass in beginnerVariant as that is a game trait, or board trait, not a row trait.
    //Bao la kiswahili is advanced bao.
    // in Beginner bao (kujifunza) All seeds are placed equally
    public BoardRow(boolean frontRow, boolean kiswahili) {
        FrontRow = frontRow;
        for (int i = 0; i<8; i++) {
            Pits[i] = new BoardPit(this.FrontRow, i);
            //kiswahili. 6 in nyumba and 2 in the next two right
            if (kiswahili)
            {
                if (this.FrontRow)
                {
                    if (i==4)
                        Pits[i].setStones(6);
                    if (i==5 | i==6)
                        Pits[i].setStones(2);
                }
            }

            else
                Pits[i].setStones(2);
        }
    }

}
