package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button plus,minus,divide,multiply;
    double a,b,s;
    EditText fn,sn;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.PLUS);
        minus=findViewById(R.id.MINUS);
        multiply=findViewById(R.id.MULTIPLY);
        divide=findViewById(R.id.DIVIDE);
        fn=findViewById(R.id.firstnumber);
        sn=findViewById(R.id.secondnumber);
        t1=findViewById(R.id.textView);
        calculate();
    }
    public  void calculate()
    {

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a=Double.parseDouble(fn.getText().toString());
                b=Double.parseDouble(sn.getText().toString());
                sum();

            }
        });
        multiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a=Double.parseDouble(fn.getText().toString());
                b=Double.parseDouble(sn.getText().toString());
                mul();
            }
        });

        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a=Double.parseDouble(fn.getText().toString());
                b=Double.parseDouble(sn.getText().toString());
                sub();
            }
        });

        divide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a=Double.parseDouble(fn.getText().toString());
                b=Double.parseDouble(sn.getText().toString());
                div();
            }
        });

    }
    @SuppressLint("SetTextI18n")
    public void sum()
    {
         s=(a+b);
        t1.setText("The Sum is "+s);
    }

    public void mul()
    {
         s=a*b;
        t1.setText("The Answer is "+ s);
    }

    public void sub()
    {
        s=a-b;
        t1.setText("The Answer is "+s);
    }

    public void div()
    {
        s=a/b;
        t1.setText("The Answer is "+s);
    }


}