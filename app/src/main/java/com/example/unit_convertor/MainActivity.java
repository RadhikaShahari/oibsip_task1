package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText Enternum;
    Button centimeters;
    Button meters;
    Button miles;
    Button kilometers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output=findViewById(R.id.output);
        Enternum=findViewById(R.id.input);
        miles=findViewById(R.id.miles);
        centimeters=findViewById(R.id.centimeters);
        meters=findViewById(R.id.Meters);
        kilometers=findViewById(R.id.kilometers);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=Enternum.getText().toString();
                int number=Integer.parseInt(num);
                double meters=number*0.01;
                output.setText("values in meters:"+meters);


            }
        });
        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=Enternum.getText().toString();
                int number=Integer.parseInt(num);
                double centimeters=number*100;
                output.setText("values in centimeters:"+centimeters);


            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=Enternum.getText().toString();
                int number=Integer.parseInt(num);
                double miles=number/1.609;
                output.setText("values in meters:"+miles);


            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=Enternum.getText().toString();
                int number=Integer.parseInt(num);
                double kilometers=number/1000;
                output.setText("values in kilometers:"+kilometers);


            }
        });







    }
}