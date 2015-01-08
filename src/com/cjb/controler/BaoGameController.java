package com.cjb.controler;

import com.cjb.model.BaoGame;
import sun.security.util.Debug;

/**
 * Created by chrisb on 12/17/14.
 * controller controls action, model saves / tracks state
 */
public class BaoGameController extends BaoGame {

    //kiswahili is advanced mode
    public BaoGameController(boolean kiswahili) {
        //calls base first
        super(kiswahili);
        System.out.println("after super");

    }
}
