package com.example.a126308.p03_classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class adddata extends AppCompatActivity {

    TextView tvWeek;
    TextView tvDG;
    Button btnsudmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);

        ImageView ivimage = (ImageView) findViewById(R.id.imageView);
        tvWeek = (TextView) findViewById(R.id.textViewWeek);
        tvDG = (TextView) findViewById(R.id.textViewCG);
        btnsudmit = (Button) findViewById(R.id.buttonSubmit);
//aaa
        ivimage.setImageResource(R.drawable.dg);





    }
}