package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.temperatureconverter.Model.CalTemp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button CtoF = findViewById(R.id.ButtonCtoF);
        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text = findViewById(R.id.input_temp);
                float input = Float.parseFloat(text.getText().toString());

                CalTemp Cal = new CalTemp(input);
                final TextView output = findViewById(R.id.output_show);
                String show = String.format("%.0f",Cal.Cal_CtoF());
                output.setText(show);
            }
        });

        Button FtoC = findViewById(R.id.ButtonFtoC);
        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text = findViewById(R.id.input_temp);
                float input = Float.parseFloat(text.getText().toString());
                CalTemp Cal = new CalTemp(input);
                TextView output = findViewById(R.id.output_show);
                String show = String.format("%.2f",Cal.Cal_FtoC());
                output.setText(show);
            }
        });

    }
}
