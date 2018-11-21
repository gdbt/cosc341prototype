package com.example.yhy92.cosc341proj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkout extends AppCompatActivity {

    Button b1, b2 , b3;
    Intent intent1, intent2, intent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        intent1 = new Intent(this, fooditem.class);
        b1 = (Button) findViewById(R.id.b_gobacktofooditem);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        intent2 = new Intent(this, newaddress.class);
        b2 = (Button) findViewById(R.id.b_newaddressinput);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });

        intent3 = new Intent(this, comfirmation.class);
        b3 = (Button) findViewById(R.id.b_buy2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent3);
            }
        });

    }
}
