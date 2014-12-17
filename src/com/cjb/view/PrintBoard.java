package com.cjb.view;

import com.cjb.model.Board;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class PrintBoard {
    public static void ConsoleOut(Board currBoard)
    {
        String topBoarder = "";
        for (int i = 0; i< 8; i++)
            topBoarder += "---";
        System.out.println(topBoarder);
    }
}
