package com.example.filealan.youniverse;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

TextView clickText;
TextView userName;
TextView password;
TextView welcomeText;
EditText userNameField;
EditText passwordField;
Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickText = (TextView)findViewById(R.id.clickText);
        userName = (TextView)findViewById(R.id.userName);
        password = (TextView)findViewById(R.id.password);
        welcomeText = (TextView)findViewById(R.id.welcomeText);
        userNameField = (EditText)findViewById(R.id.userNameField);
        passwordField = (EditText)findViewById(R.id.passwordField);
        proceedButton = (Button)findViewById(R.id.proceedButton);

        clickText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sign_up);
            }
        });

    }
}




