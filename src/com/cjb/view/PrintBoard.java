package com.cjb.view;

import com.cjb.model.Board;
import com.cjb.model.BoardRow;

/**
 * Created by CBurkhar on 12/3/2014.
 */
public class PrintBoard {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String PIT_SEPERATOR = "|";

    public static void ConsoleOut(Board currBoard)
    {
        String topBorder = "";

        for (int i = 0; i< 8; i++)
            topBorder += "---";
        System.out.println(topBorder);
        //Get row we are printing (there are 4) to reduce graph and make it easier to send to helper function
        DrawRow(currBoard.playerABoard.backRow, true);
        DrawRow(currBoard.playerABoard.frontRow, true);
        DrawRow(currBoard.playerBBoard.frontRow, false);
        DrawRow(currBoard.playerBBoard.backRow, false);

    }

    //player A is north. player B is south.
    //Need to paint board in opposite direction for player A
    private static void DrawRow(BoardRow currentRow, boolean Reverse)
    {
        String boardRow = "";
        for (int i = 0; i< currentRow.Pits.length; i++) {
            int j = i;
            if (Reverse)
                j = currentRow.Pits.length - 1 - i; //when i == 0 then 7. When i == 1 then j = 6
            boardRow += PIT_SEPERATOR;
            if (currentRow.Pits[j].isNyumba())
                boardRow += ANSI_RED;
            if (currentRow.Pits[j].isKichwa())
                boardRow += ANSI_GREEN;
            if (currentRow.Pits[j].isKimbi())
                boardRow += ANSI_BLUE;
            boardRow += Integer.toString(currentRow.Pits[j].getStones()) + ANSI_RESET;


            //Finish pit and reset color
            boardRow += PIT_SEPERATOR + ANSI_RESET;
        }
        System.out.println(boardRow);
    }
}
