package com.androiduiexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androiduiexamples.circularImage.circularImageActivity;
import com.androiduiexamples.customToolbar.customToolbarActivity;
import com.androiduiexamples.navigationDrawer.navigationDrawerActivity;
import com.androiduiexamples.recyclerView.recyclerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gotoRecycler = findViewById(R.id.gotoRecycler);
        gotoRecycler.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent jumpIntent = new Intent(MainActivity.this, recyclerActivity.class);
                startActivity(jumpIntent);
            }

        });


        Button gotoNavigationDrawer = findViewById(R.id.gotoNavigationDrawer);
        gotoNavigationDrawer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent jumpIntent = new Intent(MainActivity.this, navigationDrawerActivity.class);
                startActivity(jumpIntent);
            }

        });

        Button gotoCustomToolbar = findViewById(R.id.gotoCustomToolbar);
        gotoCustomToolbar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent jumpIntent = new Intent(MainActivity.this, customToolbarActivity.class);
                startActivity(jumpIntent);
            }

        });

        Button gotoCircularImage = findViewById(R.id.gotoCircularImage);
        gotoCircularImage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent jumpIntent = new Intent(MainActivity.this, circularImageActivity.class);
                startActivity(jumpIntent);
            }

        });


    }
}
