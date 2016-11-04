package com.example.alfinuri.day04;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ImplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button alarmButton = (Button) findViewById(R.id.alarm_button);
        alarmButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               // try {
                                               Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                                                       .putExtra(AlarmClock.EXTRA_MESSAGE, "Alarm Test")
                                                       .putExtra(AlarmClock.EXTRA_HOUR, 3)
                                                       .putExtra(AlarmClock.EXTRA_MESSAGE, 30);
                                               if (intent.resolveActivity(getPackageManager()) != null) {
                                                   startActivity(intent);
                                               }
                                        /* }catch(Exception e){
                                             Log.e(LOG_TAG, "Alarm Error", e);
                                         }finally {
                                             Log.i(LOG_TAG,"Alarm has been tested!");
                                         }
                                     } */
                                           }
                                       }
        );
    }

}

