package com.example.dsdatsme.instaclone.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dsdatsme.instaclone.R;

/**
 * Created by acer on 17-03-2018.
 */

public class CameraFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera,container,false);
        //Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        //startActivity(intent);
        return view;
    }
}
