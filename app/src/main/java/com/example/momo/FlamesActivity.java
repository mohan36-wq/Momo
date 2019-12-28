package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FlamesActivity extends AppCompatActivity {

   // TextView countdisp;
    EditText name1,name2;
    Button go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames);

       // countdisp = findViewById(R.id.textView3);
        name1 = findViewById(R.id.editText);
        name2 = findViewById(R.id.editText2);
        go = findViewById(R.id.button_go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(FlamesActivity.this, FlamesCalculator.class));
                int i, j, k = 0, count;
                String s1 = new String();
                String s2 = new String();
                String s3 = new String();
                String s4 = new String();
                s1 = name1.getText().toString();
                s2 = name2.getText().toString();
                s1.toLowerCase();
                s2.toLowerCase();
                for (i = 0; i < s1.length() - 1; i++)
                    for (j = 0; j <= s2.length() - 1; j++)
                        if (s1.charAt(i) == s2.charAt(j)) {
                            s3 = s3 + s1.charAt(i);
                            k++;
                        }
//System.out.println(s3);
                for (i = 0; i < s3.length(); i++) {
                    for (j = 0; j < i; j++)
                        if (s3.charAt(i) == s3.charAt(j))
                            break;
                    if (j == i)
                        s4 = s4 + s3.charAt(i);
                }
                count = s4.length();
                Intent intent=new Intent(FlamesActivity.this,FlamesCalculator.class);
                intent.putExtra("Count val",count);
                startActivity(intent);
                //countdisp.setText(String.valueOf(count));

                //System.out.println(count);
            }
        });
    }

    }

