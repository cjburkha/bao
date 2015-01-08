package com.cjb;

import com.cjb.controler.BaoGameController;
import com.cjb.model.BaoGame;
import com.cjb.model.Board;
import com.cjb.view.PrintBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myInput;
        System.out.println("My Program");
        //param is kiswahili (advanced)
        BaoGame g = new BaoGameController(true);
        //Board b = new Board();
        PrintBoard.ConsoleOut(g.getBoard());
        //myInput = System.console().readLine();
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
