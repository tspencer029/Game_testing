package com.example.filealan.youniverse;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.filealan.youniverse.Layout_Classes.Main_SignIn_Page;

public class MainActivity extends Activity {

    public ControlCentre control;
    public static int layout_state = R.layout.activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialises the control centre and sets the layout
        control = ControlCentre.getInstance (this);
        control.setLayout ();
    }
}




