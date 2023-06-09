package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {
    Button showans,Againbtn;
    TextView showAns;
    EditText getVal;
    RadioButton c2f,f2c;
    Double x;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showans=(Button)findViewById(R.id.showans);
        showAns=(TextView)findViewById(R.id.showAns);
        Againbtn=(Button)findViewById(R.id.Againbtn);
        getVal=(EditText)findViewById(R.id.getVal);
        c2f=(RadioButton)findViewById(R.id.c2f);
        f2c=(RadioButton)findViewById(R.id.f2c);
        showans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getVal.getText().toString().isEmpty()){
                    showAns.setText("Please give temperature");
                }
                else {
                    x=Double.parseDouble(String.valueOf(getVal.getText()));
                    if(c2f.isChecked()){
                        x=(x*9)/5+32;
                        x=Double.parseDouble(new DecimalFormat("##.###").format(x));

                        showAns.setText(String.valueOf(x)+"Degree F");
                    }
                    else if (f2c.isChecked()){
                        x=(x-32)*5/9;
                        x=Double.parseDouble(new DecimalFormat("##.###").format(x));
                        showAns.setText(String.valueOf(x)+"Degree C");
                    }
                    else {
                        showAns.setText("Please Select an option!");
                    }
                }
            }
        });



    }
}