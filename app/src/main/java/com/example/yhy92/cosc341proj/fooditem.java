package com.example.yhy92.cosc341proj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class fooditem extends AppCompatActivity {

    Button b, buy;
    ImageButton ib;
    Intent intent1, intent2;
    Spinner quan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooditem);

        quan = findViewById(R.id.sp_quan);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.num, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quan.setAdapter(adapter);

        intent1 = new Intent(this, buyfoodlist.class);
        b = (Button) findViewById(R.id.b_gobacktobuy);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        intent2 = new Intent(this, checkout.class);
        buy = (Button) findViewById(R.id.b_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
    }
}
