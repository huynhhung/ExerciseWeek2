package com.example.inspiron.exweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class ChangeBackgroundActivity extends AppCompatActivity {

    Button btnSave;
    ImageView imgBG1, imgBG2, imgBG3, imgBG4, imgBG5, imgBG6, imgPreviewImage;
    ArrayList<Integer> listBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        btnSave =  (Button) findViewById(R.id.btnSave);
        imgPreviewImage = (ImageView) findViewById(R.id.imgPreviousImage);
        imgBG1 = (ImageView) findViewById(R.id.imgBG1);
        imgBG2 = (ImageView) findViewById(R.id.imgBG2);
        imgBG3 = (ImageView) findViewById(R.id.imgBG3);
        imgBG4 = (ImageView) findViewById(R.id.imgBG4);
        imgBG5 = (ImageView) findViewById(R.id.imgBG5);
        imgBG6 = (ImageView) findViewById(R.id.imgBG6);
        listBackground = new ArrayList<Integer>();
        imgBG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_248651677_supersize);
                listBackground.add(1);
            }
        });

        imgBG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_130125752_huge);
                listBackground.add(2);
            }
        });

        imgBG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_280897220_huge);
                listBackground.add(3);
            }
        });

        imgBG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_316465280_huge);
                listBackground.add(4);
            }
        });

        imgBG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_333376544_huge);
                listBackground.add(5);
            }
        });

        imgBG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreviewImage.setImageResource(R.drawable.shutterstock_390660301_huge);
                listBackground.add(6);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("key_chooseBackground", listBackground.get(listBackground.size()-1));
                listBackground = null;
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
