package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FlamesCalculator extends AppCompatActivity {

    ImageView iv_f, iv_l, iv_a, iv_m, iv_e, iv_s;
    Button bt_calculator, bt_back;
    TextView edCount;
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

        bt_calculator = findViewById(R.id.button_calculate);
        bt_back = findViewById(R.id.button);
       edCount = findViewById(R.id.textView2);

        bt_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent getintent=getIntent();
                int count= getintent.getIntExtra("Count val",0);
                edCount.setText(String.valueOf(count));

                int i,j,n,time = 1000;
                String s = new String("FLAMES");
                String s1;
                for(i=count-1,n=6;n!=1;i+=(count-1))
                {
                    if(i>=n)
                        i%=n;
                    if(i<n)
                    {
                        s1 = ((Character)s.charAt(i)).toString();
                        s=s.replace(s1,"");
                        switch (s1) {
                            case "F":
                                new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_f.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;

                            case "L":
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;

                            case "A":
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;

                            case "M":
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_m.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;

                            case "E":
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_e.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;

                            case "S":
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_s.setVisibility(View.INVISIBLE);
                            }
                        }, time);
                        break;
                        }
                    }
                    n--;
                    time+=1000;
                }
            }
            });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FlamesCalculator.this, FlamesActivity.class));
            }
        });
    }
}
