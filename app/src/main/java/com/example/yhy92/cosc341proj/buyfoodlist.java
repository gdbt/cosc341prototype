package com.example.yhy92.cosc341proj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class buyfoodlist extends AppCompatActivity {

    ImageButton b;
    Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyfoodlist);
        intent1 = new Intent(this, fooditem.class);
        b = (ImageButton) findViewById(R.id.b_chicken);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}
