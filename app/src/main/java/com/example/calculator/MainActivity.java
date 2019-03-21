package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView e;
    String[] values={};
    String x="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (TextView) findViewById(R.id.editText);

    }

    public void b1(View view) {
        x+="1";
        e.setText(x);
    }

    public void b2(View view) {
        x+="2";
        e.setText(x);
    }

    public void b3(View view) {
        x+="3";
        e.setText(x);
    }

    public void b4(View view) {
        x+="4";
        e.setText(x);
    }

    public void b5(View view) {
        x+="5";
        e.setText(x);
    }

    public void b6(View view) {
        x+="6";
        e.setText(x);
    }

    public void b7(View view) {
        x+="7";
        e.setText(x);
    }

    public void b8(View view) {
        x += "8";
        e.setText(x);
    }

    public void b9(View view) {
        x+="9";
        e.setText(x);
    }

    public void b0(View view) {
        x+="0";
        e.setText(x);
    }

    public void eq(View view)
    {
         int f=0;
        String d = e.getText().toString();
        String[] arr = new String[100];
        String[] arr2 = new String[100];
        String m="";
        for(int i=0;i<d.length();i++)
        {
            arr[i] = String.valueOf(d.charAt(i));
        }

        for(int i=0;i<d.length();i++)
        {

            if(arr[i].equals("+")||arr[i].equals("-")||arr[i].equals("*")||arr[i].equals("/"))
            {
                arr2[f] = m;
                m = "";
                ++f;
                arr2[f] = arr[i];
                ++f;
            }
            else
            {
                m+=arr[i];
            }
            arr2[f]=m;
        }

        for(int i=0;i<f;i++) {
            if (arr2[i].equals("/")) {
                Float c = Float.parseFloat((arr2[i - 1])) / Float.parseFloat((arr2[i + 1]));
                arr2[i - 1] = String.valueOf(c);

                for (int j = i; j < f - 1; j++) {
                    arr2[j] = arr2[j + 2];
                }

                arr2[f] = "";
                arr2[f - 1] = "";
                f = f - 2;
                i = 0;
            }

        }
        for(int i=0;i<f;i++) {

            if (arr2[i].equals("*")) {
                Float c = Float.parseFloat((arr2[i - 1])) * Float.parseFloat((arr2[i + 1]));
                arr2[i - 1] = String.valueOf(c);

                for (int j = i; j < f - 1; j++) {
                    arr2[j] = arr2[j + 2];
                }

                arr2[f] = "";
                arr2[f - 1] = "";
                f = f - 2;
                i=0;
            }
        }
        for(int i=0;i<f;i++) {

            if (arr2[i].equals("-")) {
                Float c = Float.parseFloat((arr2[i - 1])) - Float.parseFloat((arr2[i + 1]));
                arr2[i - 1] = String.valueOf(c);

                for (int j = i; j < f - 1; j++) {
                    arr2[j] = arr2[j + 2];
                }

                arr2[f] = "";
                arr2[f - 1] = "";
                f = f - 2;
                i=0;
            }
        }
        for(int i=0;i<f;i++) {

            if (arr2[i].equals("+")) {
                Float c = Float.parseFloat((arr2[i - 1])) + Float.parseFloat((arr2[i + 1]));
                arr2[i - 1] = String.valueOf(c);

                for (int j = i; j < f - 1; j++) {
                    arr2[j] = arr2[j + 2];
                }

                arr2[f] = "";
                arr2[f - 1] = "";
                f = f - 2;
                i=0;
            }
        }


        e.setText(String.valueOf(arr2[0]));
       x=String.valueOf(arr2[0]);
    }

    public void plus(View view) {
        x+="+";
        e.setText(x);
    }

    public void minus(View view) {
        x+="-";
        e.setText(x);
    }

    public void product(View view) {
        x+="*";
        e.setText(x);
    }

    public void div(View view) {
        x+="/";
        e.setText(x);
    }

    public void cancel(View view) {
        x="";
        e.setText(x);
    }
}
