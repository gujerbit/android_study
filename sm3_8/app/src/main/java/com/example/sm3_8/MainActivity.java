package com.example.sm3_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.result1);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int sum = 0;

        switch(v.getId()) {
            case R.id.add :
                sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());;
                break;
            case R.id.sub :
                sum = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());;
                break;
            case R.id.mul :
                sum = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());;
                break;
            case R.id.div :
                sum = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());;
                break;
        }

        result.setText("결과 : " + sum);
    }
}