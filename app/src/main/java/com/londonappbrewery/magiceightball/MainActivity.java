package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button theMainButton = findViewById(R.id.main_Button);

        final ImageView ballView = findViewById(R.id.ballMain);

       final int imageArray [] = {

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
               
        };

       final Random randomNum = new Random();





        theMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theNum = randomNum.nextInt(5);
                int pictureLocation = imageArray[theNum];

                ballView.setImageResource(pictureLocation);



            }
        });
    }
}
