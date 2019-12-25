package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FlamesActivity extends AppCompatActivity {

    TextView flames;
    EditText name1,name2;
    Button go;

    //String s1,s2,s3,s4,s5 =new String("FLAMES");
    //String s1=new String(),s2=new String(),s3=new String(),s4=new String(),s5=new String("FLAMES");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames);

        flames = findViewById(R.id.textView);
        name1 = findViewById(R.id.editText);
        name2 = findViewById(R.id.editText2);
        go = findViewById(R.id.button_go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         startActivity(new Intent(FlamesActivity.this, FlamesCalculator.class));
        }
        });
    }
}
