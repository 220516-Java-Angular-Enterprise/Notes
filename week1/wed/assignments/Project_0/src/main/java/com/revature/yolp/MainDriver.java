package com.revature.yolp;

import com.revature.yolp.services.UserService;
import com.revature.yolp.ui.StartMenu;

public class MainDriver {
    public static void main(String[] args){

        UserService userService = new UserService();

        /* anonymous function*/
        /* This anonymous function will disappear after the start method executes */
        new StartMenu(userService).start();
    }
}
