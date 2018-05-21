package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.filealan.youniverse.R;

public class Main_SignIn_Page {

    private static Main_SignIn_Page instance = null;
    Activity activity;

    /**
     * Constructor to set up the Main Page
     * */
    public Main_SignIn_Page(Activity act){
        act.setContentView(R.layout.activity_main);
        activity = act;
    }

    /**
     * Sets up the buttons and functionality of the main SignIn page
     * */
    public void setUpMainPage() {

       TextView clickText = (TextView) activity.findViewById (R.id.clickText);
       TextView userName = (TextView) activity.findViewById (R.id.userName);
       TextView password = (TextView) activity.findViewById (R.id.password);
       TextView welcomeText = (TextView) activity.findViewById (R.id.welcomeText);
       EditText userNameField = (EditText) activity.findViewById (R.id.userNameField);
       EditText  passwordField = (EditText) activity.findViewById (R.id.passwordField);
       Button  proceedButton = (Button) activity.findViewById (R.id.proceedButton);

       clickText.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                activity.setContentView (R.layout.sign_up);
            }
        });
    }

    /**
     * This method sets up the Main SignIn Page to have only one instance
     * One instance of the class will exist at one time
     * The class is instantiated using the getInstance method which always overwrites the previous instance
     */
    public static Main_SignIn_Page getInstance(Activity act) {
        instance = new Main_SignIn_Page (act);
        return instance;
    }
}
