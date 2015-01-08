package com.cjb.controler;

import com.cjb.model.BaoGame;

/**
 * Created by chrisb on 12/17/14.
 * may be a singleton, only need one controler at once. May not be important.
 */
public class BaoController {
    public static BaoGameController game;

    private static final BaoController INSTANCE = new BaoController();

    private BaoController() {
        //this.game = new BaoGameController();
    }

    public static BaoController getInstance()
    {
        return INSTANCE;
    }

    public static void newGame(boolean kiswahili)
    {
        game = new BaoGameController(kiswahili);
    }

    public static BaoGameController getGame()
    {
        return game;
    }
}
