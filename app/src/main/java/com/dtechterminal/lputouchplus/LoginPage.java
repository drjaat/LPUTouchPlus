package com.dtechterminal.lputouchplus;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText unme;
    EditText pswd;
    int Count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        unme = findViewById(R.id.Username);
        pswd = findViewById(R.id.Password);
    }
    public void logon_fn(View view)
    {
        if(((unme.getText()).toString()).equals("1234") && ((pswd.getText()).toString()).equals("user123"))
        {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
        }
        else
        if(Count<3)
        {
            Count++;
            Toast.makeText(this, "Buddy! You've Entered the wrong Username/Password", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "You've "+(3-Count)+"Attempts Remaining", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "You've exceeded the maximum number of attempts. Please Try again Later.", Toast.LENGTH_LONG).show();
        }
    }
}
