package com.example.filealan.youniverse;

import android.app.Activity;

import com.example.filealan.youniverse.Layout_Classes.Main_SignIn_Page;

public class ControlCentre {

    private static ControlCentre instance = null;
    private static Activity act;

    //Control Centre constructor
    public ControlCentre (Activity act) { this.act = act;}

    /**
     * Set layout from memory, defaults to activity main if no other layout remembered
     */
    public void setLayout(){
        //If statement or switch between the different layouts
        if (MainActivity.layout_state == R.layout.activity_main){
            setLayout_MainSignupPage ();
        }
    }

    /**
     * Method defined to set the layout and manage the UI for the Main Signup Class
     * Constructor is called with 'getInstance' method
     * This is so that only once instance of the Main Signup Page Class ever exists at one time (memory management)
     */
    public static void setLayout_MainSignupPage(){
        Main_SignIn_Page main = Main_SignIn_Page.getInstance(act);
    }

    /**
     * Returns the instance of the control centre
     * */
    public static ControlCentre getInstance(Activity act) {
        instance = new ControlCentre (act);
        return instance;
    }
}
