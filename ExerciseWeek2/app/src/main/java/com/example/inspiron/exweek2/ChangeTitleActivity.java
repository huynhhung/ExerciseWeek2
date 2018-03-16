package com.example.inspiron.exweek2;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeTitleActivity extends AppCompatActivity {

    Button btnSave,btnPink,btnPurple,btnIndigo, btnTeal, btnBlue,btnGreen;
    EditText edtText;
    ImageView imgColor;
    int chooseColor;
    public static final String TEXT = "TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnPurple = (Button) findViewById(R.id.btnPurple);
        btnIndigo = (Button) findViewById(R.id.btnIndigo);
        btnTeal = (Button) findViewById(R.id.btnTeal);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        edtText = (EditText) findViewById(R.id.edtText);
        imgColor = (ImageView) findViewById(R.id.imViewColor);
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.green);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.green));
            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.pink);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.pink));
            }
        });

        btnTeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.teal);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.teal));
            }
        });

        btnIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.indigo);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.indigo));
            }
        });

        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.purple);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.purple));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseColor = getResources().getColor(R.color.blue);
                DrawableCompat.setTint(imgColor.getDrawable(), ContextCompat.getColor(getApplicationContext(), R.color.blue));
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra(TEXT,edtText.getText().toString());
                i.putExtra("key_chooseColor", chooseColor);
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
