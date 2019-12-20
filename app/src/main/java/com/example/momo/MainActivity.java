package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btOkay, btFlames;
    CheckBox chMomo, chJuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btOkay = findViewById(R.id.button_okay);
        chMomo = findViewById(R.id.checkBox_momo);
        chJuju = findViewById(R.id.checkBox_juju);
        btFlames = findViewById(R.id.button_flames);

        btOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chMomo.isChecked()) {
                    Toast.makeText(MainActivity.this, "Kutty kolandhai", Toast.LENGTH_SHORT).show();
                } else if(chJuju.isChecked()) {
                    Toast.makeText(MainActivity.this,"Periya Kolandhai",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btFlames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlamesActivity.class));

            }
        });

    }
}
