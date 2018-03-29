package com.example.dsdatsme.instaclone.Profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.dsdatsme.instaclone.R;
import com.example.dsdatsme.instaclone.Utils.BottomNavigationViewHelper;
import com.example.dsdatsme.instaclone.Utils.GridImageAdapter;
import com.example.dsdatsme.instaclone.Utils.UniversalImageLoader;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

/**
 * Created by acer on 16-03-2018.
 */

public class ProfileActivity extends AppCompatActivity {
    private Context context = ProfileActivity.this;
    private static final int ACTIVITY_NUMBER= 4;
    private ProgressBar mProgressBar;
    private ArrayList<Bitmap> bitmapList ;
    private GridView gridView;
    Integer[] imageID= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6};
    private ImageView profilePhoto;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupBottomNavigationView();
        setupToolbar();
        mProgressBar = (ProgressBar)findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);
        //setProfileImage();
        bitmapList = new ArrayList<>();

       // setImageGrid(bitmapList);
    }
    private void setProfileImage(){
        profilePhoto = (ImageView) findViewById(R.id.profile_image);
        String url = "";//TODO
        UniversalImageLoader.setImage(url,profilePhoto,mProgressBar,"https://");
    }

    public void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(),"Settings Clicked",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    public void setupBottomNavigationView(){

        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(context,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();

        MenuItem menuItem = menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return true;
    }

/*private void setImageGrid(ArrayList<Bitmap> urls){

    gridView = (GridView)findViewById(R.id.gridView);
    gridView.setAdapter(new ImageAdapterGridView(this,imageID));

}*/
}


