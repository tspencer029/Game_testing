package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.filealan.youniverse.MainActivity;
import com.example.filealan.youniverse.R;

public class Avatar_Selection_Page {

    private static Avatar_Selection_Page instance = null;
    Activity activity;

    /**
     * Constructor to set up the Avatar Selection Page
     * */
    public Avatar_Selection_Page(Activity act){
        act.setContentView(R.layout.avatar_selection);
        activity = act;
        MainActivity.layout_state = R.layout.avatar_selection;
        setLayout ();
    }

    /**
     * Sets up the layout for this page
     * */
    public void setLayout(){
        TextView avatar_username_display = (TextView)activity.findViewById (R.id.avatar_username);
        ImageButton avatar_back_button = (ImageButton) activity.findViewById (R.id.avatar_button_back);
        ImageView avatar_image = (ImageView) activity.findViewById (R.id.avatar_image);
        ImageButton avatar_next_button = (ImageButton) activity.findViewById (R.id.avatar_button_next);
        Button avatar_ready = (Button) activity.findViewById (R.id.avatar_button_ready);

        avatar_back_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //Change the image of the avatar to the previous image
            }
        });

        avatar_next_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //Change the image of the avatar to the next image
            }
        });

        avatar_ready.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //Go to the next screen when the avatar is ready
            }
        });
    }

    /**
     * This method sets up the Avatar Selection Page Page to have only one instance
     * One instance of the class will exist at one time
     * The class is instantiated using the getInstance method which always overwrites the previous instance
     */
    public static Avatar_Selection_Page getInstance(Activity act) {
        instance = new Avatar_Selection_Page (act);
        return instance;
    }

}
