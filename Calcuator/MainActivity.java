package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add (View v){
        int num1, num2,num3;
        EditText t1 = (EditText)findViewById(R.id.e1);
        EditText t2 = (EditText)findViewById(R.id.e2);
        TextView t3 = (TextView)findViewById(R.id.result);
        num1 = Integer.parseInt(t1.getText().toString());
        num2 = Integer.parseInt(t2.getText().toString());
        num3 = num1 + num2;
        t3.setText(Integer.toString((num3)));

    }

    public void mul (View v){
        int num1, num2,num3;
        EditText t1 = (EditText)findViewById(R.id.e1);
        EditText t2 = (EditText)findViewById(R.id.e2);
        TextView t3 = (TextView)findViewById(R.id.result);
        num1 = Integer.parseInt(t1.getText().toString());
        num2 = Integer.parseInt(t2.getText().toString());
        num3 = num1 * num2;
        t3.setText(Integer.toString((num3)));

    }

    public void sub (View v){
        int num1, num2,num3;
        EditText t1 = (EditText)findViewById(R.id.e1);
        EditText t2 = (EditText)findViewById(R.id.e2);
        TextView t3 = (TextView)findViewById(R.id.result);
        num1 = Integer.parseInt(t1.getText().toString());
        num2 = Integer.parseInt(t2.getText().toString());
        num3 = num1 - num2;
        t3.setText(Integer.toString((num3)));

    }

    public void div (View v){
        int num1, num2,num3;
        EditText t1 = (EditText)findViewById(R.id.e1);
        EditText t2 = (EditText)findViewById(R.id.e2);
        TextView t3 = (TextView)findViewById(R.id.result);
        num1 = Integer.parseInt(t1.getText().toString());
        num2 = Integer.parseInt(t2.getText().toString());
        num3 = num1 / num2;
        t3.setText(Integer.toString((num3)));

    }
}
