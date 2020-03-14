package com.ashwin.android.svganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView animationImageView = (ImageView) findViewById(R.id.animation_imageview);
        animationDrawable = (AnimationDrawable) animationImageView.getDrawable();
    }

    public void start(View view) {
        if (!animationDrawable.isRunning()) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
        }
    }
}
