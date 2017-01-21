package com.example.jcalzado.lab2_layouts003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView lockImage;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lockImage = (ImageView) findViewById(R.id.lockImage);
        button = (Button) findViewById(R.id.button);
    }

    public void bloquear (View v) {
        button.setVisibility(v.GONE);
    }
}
