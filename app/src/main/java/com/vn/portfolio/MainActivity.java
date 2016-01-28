package com.vn.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSpotify = (Button) findViewById(R.id.button1);
        Button buttonScores = (Button) findViewById(R.id.button2);
        Button buttonLibrary = (Button) findViewById(R.id.button3);
        Button buttonBuildBig = (Button) findViewById(R.id.button4);
        Button buttonXyz = (Button) findViewById(R.id.button5);
        Button buttonCapstone = (Button) findViewById(R.id.button6);

    }

    public void display(View view) {
    }
}
