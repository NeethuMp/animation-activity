package com.example.neethu.animationactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView animView;
    Button translationButton,rotationButton,scalingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animView= (ImageView) findViewById(R.id.anim_view);
        translationButton= (Button) findViewById(R.id.trans_btn);
        rotationButton= (Button) findViewById(R.id.rot_btn);
        scalingButton= (Button) findViewById(R.id.scale_btn);
        scalingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scaleAnimation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaling);
                animView.startAnimation(scaleAnimation);
            }
        });
        rotationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotationanimation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotation);
                animView.startAnimation(rotationanimation);
            }
        });
        translationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation translatioAnimation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translation);
                animView.startAnimation(translatioAnimation);
            }
        });
    }
}
