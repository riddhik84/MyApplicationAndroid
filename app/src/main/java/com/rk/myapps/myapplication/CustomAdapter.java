package com.rk.myapps.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;

public class CustomAdapter extends BaseAdapter {

    private Context mContext;

    static final int[] gridImagesArray = new int[] {

            R.drawable.face1,
            R.drawable.face2,
            R.drawable.face3,
            R.drawable.face1,
            R.drawable.face2,
            R.drawable.face3,
            R.drawable.face1,
            R.drawable.face2,
            R.drawable.face3,
            R.drawable.face1,
            R.drawable.face2,
            R.drawable.face3,
    };

    public CustomAdapter(Context c)
    {
        mContext = c;
    }

    @Override
    public int getCount() {
        return gridImagesArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int Position, View convertView, ViewGroup parent){
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
        } else
        {
            imageView = (ImageView) convertView;
        }

        Picasso.with(mContext).
                load(gridImagesArray[Position]).
                noFade().
                resize(300,300).
                into(imageView);

        return imageView;
    }
}
