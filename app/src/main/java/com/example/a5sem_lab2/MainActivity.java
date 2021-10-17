package com.example.a5sem_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView viewOrientationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewOrientationText = this.findViewById(R.id.view_orientation);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            this.viewOrientationText.setText(R.string.landscape_view);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            this.viewOrientationText.setText(R.string.portrait_view);
        }
    }
}