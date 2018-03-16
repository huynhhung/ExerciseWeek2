package com.example.inspiron.exweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button btnChangeTitle, btnChangeBackground;
    ImageView txtvText;
    private static final int REQUEST_ACT_B = 1000;
    private static final int REQUEST_ACT_C = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeTitle = (Button) findViewById(R.id.btnChangeTitle);
        btnChangeBackground = (Button) findViewById(R.id.btnChangeBackground);
        txtvText = (ImageView) findViewById(R.id.txtvText);
        btnChangeTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ChangeTitleActivity.class);
                startActivityForResult(i,REQUEST_ACT_B);
            }
        });

        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ChangeBackgroundActivity.class);
                startActivityForResult(i,REQUEST_ACT_C);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_ACT_B){
            if(resultCode == RESULT_OK){
                //get data
                //txtvText.setText(data.getStringExtra(ChangeTitleActivity.TEXT));

                //txtvText.setTextColor(data.getExtras().getInt("key_chooseColor"));
            }
        }

        if(requestCode == REQUEST_ACT_C){
            if(resultCode == RESULT_OK){
                //get data
                int backgroundChoose = data.getExtras().getInt("key_chooseBackground");
                switch (backgroundChoose){
                    case 1:
                        Picasso.get().load(R.drawable.shutterstock_248651677_supersize).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_248651677_supersize);
                        break;
                    case 2:
                        Picasso.get().load(R.drawable.shutterstock_130125752_huge).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_130125752_huge);
                        break;
                    case 3:
                        Picasso.get().load(R.drawable.shutterstock_280897220_huge).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_280897220_huge);
                        break;
                    case 4:
                        Picasso.get().load(R.drawable.shutterstock_316465280_huge).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_316465280_huge);
                        break;
                    case 5:
                        Picasso.get().load(R.drawable.shutterstock_333376544_huge).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_333376544_huge);
                        break;
                    case 6:
                        Picasso.get().load(R.drawable.shutterstock_390660301_huge).into(txtvText);
                        //txtvText.setBackgroundResource(R.drawable.shutterstock_390660301_huge);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
