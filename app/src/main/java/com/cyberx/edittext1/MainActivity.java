package com.cyberx.edittext1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1;
    private EditText editText2;
    private Button addButton;
    private Button substractionButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1_id);
        editText2 = (EditText) findViewById(R.id.editText2_id);
        addButton = (Button) findViewById(R.id.additionId);
        substractionButton = (Button) findViewById(R.id.substractionId);
        resultView = (TextView) findViewById(R.id.resultId);

        addButton.setOnClickListener(this);
        substractionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       try {
           String number1 = editText1.getText().toString();
           String number2 = editText2.getText().toString();
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           if (v.getId() == R.id.additionId) {
               double sum = num1 + num2;
               resultView.setText("Result: " + sum);
           } else if (v.getId() == R.id.substractionId) {
               double sub = num1 - num2;
               resultView.setText("Result: " + sub);
           }
       }catch (Exception e){
           Toast.makeText(MainActivity.this, "please enter number", Toast.LENGTH_SHORT).show();
       }
    }
}