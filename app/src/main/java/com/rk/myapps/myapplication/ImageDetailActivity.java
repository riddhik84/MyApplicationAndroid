package com.rk.myapps.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);

        ImageView imageView = (ImageView) findViewById(R.id.image_detail);

        int position = getIntent().getIntExtra("position", -1);
        if(position != -1)
        {
            Picasso.with(ImageDetailActivity.this).
                    load(CustomAdapter.gridImagesArray[position]).
                    noFade().
                    resize(800, 800).
                    centerCrop().
                    into(imageView);
        } else
        {
            Picasso.with(ImageDetailActivity.this).
                    load(R.drawable.face3).
                    noFade().
                    resize(800, 800).
                    centerCrop().
                    into(imageView);
        }
    }

}
