package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FlamesCalculator extends AppCompatActivity {

    ImageView iv_f, iv_l, iv_a, iv_m, iv_e, iv_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames_calculator);

        iv_f = findViewById(R.id.imageView_f);
        iv_l = findViewById(R.id.imageView_l);
        iv_a = findViewById(R.id.imageView_a);
        iv_m = findViewById(R.id.imageView_m);
        iv_e = findViewById(R.id.imageView_e);
        iv_s = findViewById(R.id.imageView_s);

        int count = 1;

        switch (count) {
            case 1:
                iv_f.setVisibility(View.VISIBLE);
        }
    }
}
