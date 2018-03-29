package com.example.dsdatsme.instaclone.Profile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by acer on 18-03-2018.
 */

public class ImageAdapterGridView extends BaseAdapter {
    private Context mContext;
    private Integer[]  imageID;

    public ImageAdapterGridView(Context c, Integer[] mArray) {
        mContext = c;
        imageID = mArray;
    }

    public int getCount() {
        return imageID.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView mImageView;

        if (convertView == null) {
            mImageView = new ImageView(mContext);
            mImageView.setLayoutParams(new GridView.LayoutParams(130, 130));
            mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mImageView.setPadding(16, 16, 16, 16);
        } else {
            mImageView = (ImageView) convertView;
        }
        mImageView.setImageResource(imageID[position]);
        return mImageView;
    }
}
