package com.vn.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view) {
        switch(view.getId()){
            case R.id.button1:
                // Code for button 1 click
                Toast.makeText(this,"This Button will launch my Spotify Streamer app !",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                // Code for button 2 click
                Toast.makeText(this,"This Button will launch my Scores app !",
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.button3:
                // Code for button 3 click
                Toast.makeText(this,"This Button will launch my Library app !",
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.button4:
                // Code for button 4 click
                Toast.makeText(this,"This Button will launch my Build It Bigger app !",
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.button5:
                // Code for button 5 click
                Toast.makeText(this,"This Button will launch my XYZ Reader app !",
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.button6:
                // Code for button 6 click
                Toast.makeText(this,"This Button will launch my Capstone app !",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
