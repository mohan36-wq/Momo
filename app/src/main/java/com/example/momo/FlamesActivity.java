package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FlamesActivity extends AppCompatActivity {

    TextView flames;
    EditText name1,name2;
    String s1,s2,s3,s4,s5=new String("FLAMES");
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames);
        flames.findViewById(R.id.textView);
        name1.findViewById(R.id.editText);
        name2.findViewById(R.id.editText2);
        go.findViewById(R.id.button);
        s1=name1.getText().toString();
        s2=name2.getText().toString();
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i, j, count, k = 0, n;
                for (i = 0; i < s1.length(); i++) {
                    for (j = 0; j < s2.length(); j++) {
                        if (s1[i] == s2[j])
                            s3[k] = s1[i];
                    }
                }
                k = 0;
                for (i = 0; i < s3.length(); i++) {
                    for (j = 0; j < i; j++)
                        if (s3[i] == s3[j])
                            break;
                    if (j == i)
                        s4[k++] = s3[i];
                }
                k--;
                n = 6;
                for (i = k; n != 1; i = i + 3) {
                    if (i > n)
                        i = n % i;
                    j = 0;
                    while (i < n) {
                        s5[i] = s5[i + j];
                        j++;
                    }
                    n--;
                }


            }
        };
