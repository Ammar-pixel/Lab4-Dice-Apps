package com.testapp1.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity<images> extends AppCompatActivity {

    ImageView imageView,imageView2;
    Button button;

    int[] images ={R.drawable.diceone, R.drawable.dicetwo, R.drawable.dicethree ,
            R.drawable.dicefour, R.drawable.dicefive , R.drawable.dicesix
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =(ImageView)findViewById(R.id.imageView4);
        imageView2 =(ImageView)findViewById(R.id.imageView5);

        button = (Button) findViewById(R.id.button);
        Random rand = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display random image
                imageView.setImageResource(images[rand.nextInt(images.length)]);
                imageView2.setImageResource(images[rand.nextInt(images.length)]);
            }
        });
    }
}