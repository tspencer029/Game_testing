package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;
import android.media.Image;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.filealan.youniverse.MainActivity;
import com.example.filealan.youniverse.R;

public class Map_Page {

    private static Map_Page instance = null;
    Activity activity;

    public Map_Page(Activity act){
        act.setContentView(R.layout.map_progress_screen);
        activity = act;
        setMapLayout();
    }

    public void setMapLayout(){

        ImageButton settingsButton = (ImageButton)activity.findViewById(R.id.profile_settings);
        ImageView image1 = (ImageView)activity.findViewById(R.id.planet_placeholder1);
        ImageView image2 = (ImageView)activity.findViewById(R.id.planet_placeholder2);


    }

    public static Map_Page getInstance(Activity act) {
        instance = new Map_Page(act);
        return instance;
    }
}
