package com.example.alfinuri.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);
        Button back3 = (Button) findViewById(R.id.back3);
        Button next3 = (Button) findViewById(R.id.next3);

        //TODO Intent for Back to P2
        back3.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                                         startActivity(intent);
                                     }
                                 }
        );

        //TODO Intent for Next to P2
        next3.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent(PageThreeActivity.this, ImplicitActivity.class);
                                         // intent.putExtra("MessageP1", message);
                                         startActivity(intent);
                                     }
                                 }
        );
    }
}
