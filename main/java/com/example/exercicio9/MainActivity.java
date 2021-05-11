package com.example.exercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        edt=findViewById(R.id.edt);
    }
    public  void  Kwanza(View v)
    {
        double k=Double.parseDouble(edt.getText().toString());
        Toast.makeText(this, k +" Equivale a " +(k*785.14) + " Kwanza", Toast.LENGTH_LONG).show();
    }
    public  void Real(View v)
    {
        double k=Double.parseDouble(edt.getText().toString());
        Toast.makeText(this, k +" Equivale a " +(k*6.44) + " Real", Toast.LENGTH_LONG).show();
    }
    public  void Dolar(View v)
    {
        double k=Double.parseDouble(edt.getText().toString());
        Toast.makeText(this, k +" Equivale a " +(k*1.20) + " Dólar", Toast.LENGTH_LONG).show();
    }
}