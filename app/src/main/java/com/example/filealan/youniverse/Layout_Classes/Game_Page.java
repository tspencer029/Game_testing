package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import com.example.filealan.youniverse.GameView;

public class Game_Page {

    private static Game_Page instance = null;
    Activity activity;

    /**
     * Constructor to set up the Avatar Selection Page
     * */
    public Game_Page(Activity act){
        activity = act;
        act.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        act.setContentView(new GameView(act.getBaseContext ()));

    }

    public static Game_Page getInstance(Activity act) {
        instance = new Game_Page (act);
        return instance;
    }

}
