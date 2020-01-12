package com.androiduiexamples.navigationDrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;



import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;


import com.androiduiexamples.R;
import com.google.android.material.navigation.NavigationView;

//https://guides.codepath.com/android/fragment-navigation-drawer#define-fragments

public class navigationDrawerActivity extends AppCompatActivity {


    public DrawerLayout mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        // Set a Toolbar to replace the ActionBar.
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // This will display an Up icon (<-)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mDrawer = findViewById(R.id.drawer_layout);


        NavigationView nvDrawer = findViewById(R.id.nvView);


        // handle clicked
        nvDrawer.setNavigationItemSelectedListener(

                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }

                });

    }


    // function to override default action bar's button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        System.out.println("onOptionsItemSelected clicked");

        // The action bar home/up action should open or close the drawer.

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(Gravity.RIGHT);
                return true;
        }

        return super.onOptionsItemSelected(item);

    }


    public void selectDrawerItem(MenuItem menuItem) {

        switch(menuItem.getItemId()) {
            case R.id.nav_first_fragment:
                Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_second_fragment:
                Toast.makeText(getApplicationContext(), "Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_third_fragment:
                Toast.makeText(getApplicationContext(), "Third", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(), "default", Toast.LENGTH_SHORT).show();
        }

        //mDrawer.closeDrawer(Gravity.RIGHT);

    }


}