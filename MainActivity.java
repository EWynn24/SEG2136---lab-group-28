package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnDiv,btnMul,btnClr,btnEql,btnDec;
    TextView display;
    double val1,val2;
    boolean add,sub,mul,div,fin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=findViewById(R.id.display);
        fin=false;
        btnClr=findViewById(R.id.btnClr);
        btn0=findViewById(R.id.btn0);
        btnDec=findViewById(R.id.btnDec);
        btnDiv=findViewById(R.id.btnDiv);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnMul=findViewById(R.id.btnMul);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btnSub=findViewById(R.id.btnSub);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btnAdd=findViewById(R.id.btnAdd);
        btnEql=findViewById(R.id.btnEql);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fin==true){
                    display.setText("0.0");
                    fin=false;
                    return;
                }else{
                    if(display.getText()!="0.0" && display.getText()!="0"){
                        display.setText(display.getText()+"0");
                        return;
                    }
                }


                //display.setText("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0")|| display.getText().equals("0")){
                    display.setText("1");
                }else{
                    if(fin==true){
                        display.setText("1");
                        fin=false;
                    }else{
                        display.setText(display.getText()+"1");
                    }
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0")|| display.getText().equals("0")){
                    display.setText("2");
                }else{
                    if(fin==true){
                        display.setText("2");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "2");
                    }
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0")|| display.getText().equals("0")){
                    display.setText("3");
                }else{
                    if(fin==true){
                        display.setText("3");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "3");
                    }
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0")|| display.getText().equals("0")){
                    display.setText("4");
                }else{
                    if(fin==true){
                        display.setText("4");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "4");
                    }
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0")|| display.getText().equals("0")){
                    display.setText("5");
                }else{
                    if(fin==true){
                        display.setText("5");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "5");
                    }
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0") || display.getText().equals("0")){
                    display.setText("6");
                }else{
                    if(fin==true){
                        display.setText("6");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "6");
                    }
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0") || display.getText().equals("0")){
                    display.setText("7");
                }else{
                    if(fin==true){
                        display.setText("7");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "7");
                    }
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0") || display.getText().equals("0")){
                    display.setText("8");
                }else{
                    if(fin==true){
                        display.setText("8");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "8");
                    }
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0") || display.getText().equals("0")){
                    display.setText("9");
                }else{
                    if(fin==true){
                        display.setText("9");
                        fin=false;
                    }else {
                        display.setText(display.getText() + "9");
                    }
                }

            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("0.0") || display.getText().equals("0")){
                    display.setText("0.");
                }else{
                    if(fin==true){
                        display.setText("0.0");
                        fin=false;
                    }else {
                        display.setText(display.getText() + ".");
                    }
                }
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0.0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curr = (String) display.getText();
                val1 = Double.parseDouble(curr);
                add=true;
                div=false;
                mul=false;
                sub=false;
                display.setText("0.0");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curr = (String) display.getText();
                val1 = Double.parseDouble(curr);
                sub=true;

                add=false;
                div=false;
                mul=false;
                //sub=false;

                display.setText("0.0");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curr = (String) display.getText();
                val1 = Double.parseDouble(curr);
                mul=true;

                add=false;
                div=false;
                //mul=false;
                sub=false;

                display.setText("0.0");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curr = (String) display.getText();
                val1 = Double.parseDouble(curr);
                div=true;

                add=false;
                //div=false;
                mul=false;
                sub=false;

                display.setText("0.0");
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add==true){
                    String curr = (String) display.getText();
                    double temp = Double.parseDouble(curr);
                    val1+=temp;
                    String newText=Double.toString(val1);
                    display.setText(newText);
                    add=false;
                }else if(sub==true){
                    String curr = (String) display.getText();
                    double temp = Double.parseDouble(curr);
                    val1-=temp;
                    String newText=Double.toString(val1);
                    display.setText(newText);
                    sub=false;
                }else if (mul==true){
                    String curr = (String) display.getText();
                    double temp = Double.parseDouble(curr);
                    val1*=temp;
                    String newText=Double.toString(val1);
                    display.setText(newText);
                    mul=false;
                }else if(div==true){
                    String curr = (String) display.getText();
                    double temp = Double.parseDouble(curr);
                    val1/=temp;
                    String newText=Double.toString(val1);
                    display.setText(newText);
                    div=false;
                }

                fin=true;
                val1=0;

            }
        });



    }
}