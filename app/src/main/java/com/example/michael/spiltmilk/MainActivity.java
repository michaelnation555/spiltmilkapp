package com.example.michael.spiltmilk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v) {
        //Button b=(Button) v;
        Intent i;
        switch(v.getId()) {
            case R.id.button:
                i = new Intent(getApplicationContext(), LevelSelectActivity.class);
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(getApplicationContext(), MultiplayerSelect.class);
                startActivity(i);
                break;
            case R.id.button3:
                i = new Intent(getApplicationContext(), OptionsActivity.class);
                startActivity(i);
                break;
            case R.id.button4:
                i = new Intent(getApplicationContext(), CreditsActivity.class);
                startActivity(i);
                break;
        }
    }
}
