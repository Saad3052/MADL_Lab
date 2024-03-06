package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void add(View v){
        EditText e1 = (EditText)findViewById(R.id.num1);
        EditText e2 = (EditText)findViewById(R.id.num2);
        EditText e3 = (EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int result = n1 + n2;

        e3.setText("Result : "+ result);
    }

    public void subtract(View v){
        EditText e1 = (EditText)findViewById(R.id.num1);
        EditText e2 = (EditText)findViewById(R.id.num2);
        EditText e3 = (EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int result = n1 - n2;

        e3.setText("Result : "+ result);
    }

    public void divide(View v){
        EditText e1 = (EditText)findViewById(R.id.num1);
        EditText e2 = (EditText)findViewById(R.id.num2);
        EditText e3 = (EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        if(n2==0){
            e3.setText("Divide by zero ");
        }
        else {
            int result = n1 / n2;
            e3.setText("Result : " + result);
        }
    }

    public void multiply(View v){
        EditText e1 = (EditText)findViewById(R.id.num1);
        EditText e2 = (EditText)findViewById(R.id.num2);
        EditText e3 = (EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int result = n1 * n2;

        e3.setText("Result : "+ result);
    }
}