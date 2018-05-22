package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;

import com.example.filealan.youniverse.MainActivity;
import com.example.filealan.youniverse.R;

public class Settings_Page {
    private static Settings_Page instance = null;
    Activity activity;

    public Settings_Page(Activity act){
        act.setContentView(R.layout.setting_screen);
        activity = act;
        MainActivity.layout_state = R.layout.setting_screen;
        setSettingsLayout ();
    }

    public void setSettingsLayout(){
    }

    public static Settings_Page getInstance(Activity act) {
        instance = new Settings_Page (act);
        return instance;
    }
}
