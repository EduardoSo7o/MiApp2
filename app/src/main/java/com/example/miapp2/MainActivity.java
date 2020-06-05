package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tvMath;
    EditText tvPhysics;
    EditText tvChemistry;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMath = (EditText) findViewById(R.id.txt_Math);
        tvPhysics = (EditText)findViewById(R.id.txt_Physics);
        tvChemistry = (EditText)findViewById(R.id.txt_Chemistry);
        status = (TextView)findViewById(R.id.txt_StudentStatus);
    }

    public void getAverage(View view){

        String math = tvMath.getText().toString();
        String physics = tvPhysics.getText().toString();
        String chemistry = tvChemistry.getText().toString();

        int average = (Integer.parseInt(math) + Integer.parseInt(physics) + Integer.parseInt(chemistry)) / 3;
        String studentStatus = "";

        if(average >= 6){
            studentStatus ="Aproved " ;
        }else {
            studentStatus = "Failed";
        }

        String finalStatus = studentStatus +" Average: " + String.valueOf(average);

        status.setText(finalStatus);
    }

}