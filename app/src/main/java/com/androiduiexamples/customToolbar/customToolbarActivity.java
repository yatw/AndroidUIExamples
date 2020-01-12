package com.androiduiexamples.customToolbar;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androiduiexamples.R;


public class customToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);

        TextView title = findViewById(R.id.toolbar_title);
        title.setText("Awesome title");

    }
}
