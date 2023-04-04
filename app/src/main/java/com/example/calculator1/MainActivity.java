package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus;
    EditText fn,sn;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.PLUS);
        fn=findViewById(R.id.firstnumber);
        sn=findViewById(R.id.secondnumber);
        t1=findViewById(R.id.textView);
    }
    public  void calculate()
    {
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,t;
                a=Integer.parseInt(fn.getText().toString());
                b=Integer.parseInt(sn.getText().toString());
                t=sum(a,b);
                Toast i=new Toast(MainActivity.this,"Answer is",Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }
    public int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }

}