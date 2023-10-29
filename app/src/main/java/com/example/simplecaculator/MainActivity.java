package com.example.simplecaculator;

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

    public void onBtnClicked(View view) {
        EditText et1 = findViewById(R.id.Numet1);
        String et1Text = et1.getText().toString();
        Integer num1 = Integer.valueOf(et1Text);
        EditText et2 = findViewById(R.id.Numet2);
        String et2Text = et2.getText().toString();
        Integer num2 = Integer.valueOf(et2Text);
        Integer result = null;
        if (view.getId() == R.id.btnPlus)
            result= num1+num2;
        if (view.getId()==R.id.btnMinus)
            result=num1-num2;
        if (view.getId()==R.id.btnMult)
            result=num1*num2;
        if (view.getId()==R.id.btnDiv)
            result=num1/num2;
        if (result!=null) {
            TextView tvRes = findViewById(R.id.tvResult);
            tvRes.setText(result.toString());
        }





    }
}