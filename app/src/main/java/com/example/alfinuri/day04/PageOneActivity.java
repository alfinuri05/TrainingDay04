package com.example.alfinuri.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class PageOneActivity extends AppCompatActivity {
    public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        Button next1 = (Button) findViewById(R.id.next1);
        //EditText text1 = (EditText) findViewById(R.id.Text1);
        //    message = String.valueOf(text1.getText());

        //TODO Intent for Next to P2
        next1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageOneActivity.this, PageTwoActivity.class);
               // intent.putExtra("MessageP1", message);
                startActivity(intent);
            }
        }
        );
    }
}
