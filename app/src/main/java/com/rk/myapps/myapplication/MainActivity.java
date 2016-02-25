package com.rk.myapps.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //@Bind(R.id.image_test1)
    //ImageView image1;

    //@Bind(R.id.image_test2)
    //ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showImage(View view) {

       ImageView image1 = (ImageView) findViewById(R.id.image_test1);
       ImageView image2 = (ImageView) findViewById(R.id.image_test2);

        Picasso.with(getApplicationContext())
                .load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
                .into(image1);
        Picasso.with(getApplicationContext())
                .load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
                .into(image2);


        startActivity(new Intent(getApplicationContext(), ImagesGridView.class));
    }
}
