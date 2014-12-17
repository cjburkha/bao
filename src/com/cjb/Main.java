package com.cjb;

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
        Board b = new Board();
        PrintBoard.ConsoleOut(b);
        //myInput = System.console().readLine();
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
