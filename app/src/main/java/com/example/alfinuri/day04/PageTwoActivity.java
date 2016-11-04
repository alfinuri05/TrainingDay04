package com.example.alfinuri.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
        Button next2 = (Button) findViewById(R.id.next2);
        Button back2 = (Button) findViewById(R.id.back2);
       // TextView textView2 = (TextView) findViewById(R.id.textView2);
       // Bundle bundle = getIntent().getExtras();
       // Bundle intent2 = intent.getExtras();
       // String pagetwo = bundle.getString("MessagP1");
        //textView2.setText(pagetwo);

        //TODO Intent for Next to P3
        next2.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 }
        );

        //TODO Intent for Back to P1
        back2.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(PageTwoActivity.this, PageOneActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                }
        );
    }
}
