package com.example.dsdatsme.instaclone.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.dsdatsme.instaclone.R;
import com.example.dsdatsme.instaclone.Utils.BottomNavigationViewHelper;
import com.example.dsdatsme.instaclone.Utils.UniversalImageLoader;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.nostra13.universalimageloader.core.ImageLoader;

public class HomeActivity extends AppCompatActivity {
    private Context context = HomeActivity.this;
    private static final int ACTIVITY_NUMBER= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initImageLoader();

        setupBottomNavigationView();
        setupViewPager();


    }//end of on create

    private void initImageLoader(){
        UniversalImageLoader universalImageLoader = new UniversalImageLoader(context);
        ImageLoader.getInstance().init(universalImageLoader.getConfig());
    }
///for top ViewPager
    private void setupViewPager(){
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(new CameraFragment());
        sectionsPagerAdapter.addFragment(new HomeFragment());
        sectionsPagerAdapter.addFragment(new MessageFragment());

        ViewPager viewPager1 = (ViewPager) findViewById(R.id.container);
        viewPager1.setAdapter(sectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager1);
        viewPager1.setCurrentItem(1);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setText("Instagram");
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
        //tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.black));


    }
    ///for bottom nav bar
    ///
      public void setupBottomNavigationView(){

          BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
          BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
          BottomNavigationViewHelper.enableNavigation(context,bottomNavigationViewEx);
          Menu menu = bottomNavigationViewEx.getMenu();
          MenuItem menuItem = menu.getItem(ACTIVITY_NUMBER);
          menuItem.setChecked(true);
    }
}//end of  main
