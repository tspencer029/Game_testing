package com.example.filealan.youniverse.Layout_Classes;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.filealan.youniverse.MainActivity;
import com.example.filealan.youniverse.R;

public class Sign_Up_Page {

    private static Sign_Up_Page instance = null;
    Activity activity;

    /**
     * Constructor to set up the SignUp Page
     * */
    public Sign_Up_Page(Activity act){
        act.setContentView(R.layout.sign_up);
        activity = act;
        MainActivity.layout_state = R.layout.sign_up;
        setLayout ();
    }

    /***
     * Set up the buttons and layout of the profile page
     */
    public void setLayout(){
        TextView signup_text = (TextView) activity.findViewById (R.id.SignUpText);
        EditText signup_username = (EditText) activity.findViewById (R.id.signUp_userName);
        EditText signup_email = (EditText) activity.findViewById (R.id.emailAddress_signup);
        EditText signup_pword = (EditText)activity.findViewById (R.id.pword_signup);
        Button signup_button = (Button) activity.findViewById (R.id.button_signup);

        signup_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //What happens after you sign up
            }
        });

    }

    /**
     * This method sets up the Profile Page to have only one instance
     * One instance of the class will exist at one time
     * The class is instantiated using the getInstance method which always overwrites the previous instance
     */
    public static Sign_Up_Page getInstance(Activity act) {
        instance = new Sign_Up_Page (act);
        return instance;
    }
}
