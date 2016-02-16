package com.example.venky.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button num1, num2, num3, num4, num5,num6, num7, num8, num9, num0, add, sub,mul, div, clr, equal, decimal;
    TextView inp, res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp = (TextView)findViewById(R.id.input);
        res = (TextView)findViewById(R.id.result);
        num1 = (Button)findViewById(R.id.button1);
        num2 = (Button)findViewById(R.id.button2);
        num3 = (Button)findViewById(R.id.button3);
        num4 = (Button)findViewById(R.id.button4);
        num5 = (Button)findViewById(R.id.button5);
        num6 = (Button)findViewById(R.id.button6);
        num7 = (Button)findViewById(R.id.button7);
        num8  = (Button)findViewById(R.id.button8);
        num9  = (Button)findViewById(R.id.button9);
        num0  = (Button)findViewById(R.id.buttonZero);
        add = (Button)findViewById(R.id.buttonAdd);
        sub = (Button)findViewById(R.id.buttonSub);
        mul = (Button)findViewById(R.id.buttonMul);
        div = (Button)findViewById(R.id.buttonDiv);
        clr = (Button)findViewById(R.id.buttonClear);
        decimal = (Button)findViewById(R.id.buttonDot);
        equal = (Button)findViewById(R.id.buttonEqual);

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.setText("");
                res.setText("");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.append("0");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inp.getText().toString();
//                for()
                inp.append(".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";
                if(inp.getText()!=""){
                s = inp.getText().toString();}
                String r;

                if(s!=""){
//                    Toast.makeText(getApplicationContext(), s.charAt(s.length()-1), Toast.LENGTH_SHORT).show();
                    if(s.charAt(s.length()-1)=='+'){
//                        r = s.substring(0,s.length()-1) + "+"
                        inp.setText(s);
                    }
                    else if(s.charAt(s.length()-1)=='-'){
                        r = s.substring(0,s.length()-1) + "+";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='*'){
                        r = s.substring(0,s.length()-1) + "+";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='/'){
                        r = s.substring(0,s.length()-1) + "+";
                        inp.setText(r);
                    } else {
                        inp.append("+");
                    }
                } else {
                    inp.setText("");
                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inp.getText().toString();
                String r;
                if(s!=""){
                    if(s.charAt(s.length()-1)=='-'){
//                        r = s.substring(0,s.length()-1) + "+"
                        inp.setText(s);
                    }
                    else if(s.charAt(s.length()-1)=='+'){
                        r = s.substring(0,s.length()-1) + "-";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='*'){
                        r = s.substring(0,s.length()-1) + "-";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='/'){
                        r = s.substring(0,s.length()-1) + "-";
                        inp.setText(r);
                    } else {
                        inp.append("-");
                    }
                } else{
                    inp.setText("");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inp.getText().toString();
                String r;
                if(s!=""){
                    if(s.charAt(s.length()-1)=='*'){
//                        r = s.substring(0,s.length()-1) + "+"
                    inp.setText(s);
                    }
                    else if(s.charAt(s.length()-1)=='+'){
                         r = s.substring(0,s.length()-1) + "*";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='-'){
                        r = s.substring(0,s.length()-1) + "*";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='/'){
                        r = s.substring(0,s.length()-1) + "*";
                        inp.setText(r);
                    } else {
                        inp.append("*");
                    }
                } else {
                    inp.setText("");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inp.getText().toString();
                String r;
                if(s!=""){
                    if(s.charAt(s.length()-1)=='/'){
//                        r = s.substring(0,s.length()-1) + "+"
                        inp.setText(s);
                    }
                    else if(s.charAt(s.length()-1)=='+'){
                        r = s.substring(0,s.length()-1) + "/";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='-'){
                        r = s.substring(0,s.length()-1) + "/";
                        inp.setText(r);
                    }
                    else if(s.charAt(s.length()-1)=='*'){
                        r = s.substring(0,s.length()-1) + "/";
                        inp.setText(r);
                    } else {
                        inp.append("*");
                    }
                } else {
                    inp.setText("");
                }
            }

        });
        equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            protected Object clone() throws CloneNotSupportedException {
//                return super.clone();
//            }

            @Override
            public void onClick(View v) {

                String temp = inp.getText().toString();
                String t1="", t2="", sym = "";
                for(int i = 0; i < temp.length();i++) {
                    if(temp.charAt(i) == '+' || temp.charAt(i) == '-'||temp.charAt(i) == '*'||temp.charAt(i) == '/'){
                        t1 = temp.substring(0,i);
                        t2 = temp.substring(i+1);
                        sym = sym + temp.charAt(i);
                        break;
                    }
                }
//                res.setText(t1+t2+sym);
                if(sym.equals("+")){
                    int ress = Integer.parseInt(t1) + Integer.parseInt(t2);
                    res.setText(String.valueOf(ress));
                } else if(sym.equals("-")) {
                    int ress = Integer.parseInt(t1) - Integer.parseInt(t2);
                    res.setText(String.valueOf(ress));
                }else if(sym.equals("*")) {
                    int ress = Integer.parseInt(t1) * Integer.parseInt(t2);
                    res.setText(String.valueOf(ress));
                }else if(sym.equals("/")) {
                    int ress = Integer.parseInt(t1) / Integer.parseInt(t2);
                    res.setText(String.valueOf(ress));
                }
            }
        });


    }

}
