package com.example.threeinone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorActivity extends AppCompatActivity {

    TextView solution , answer;
    ImageButton back;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,clear,remainder,equalsTo,dot,fback,bback;
    boolean lastdot,isNumeric,IsError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getId();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"1");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"1");
                }
                isNumeric=true;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"2");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"2");
                }
                isNumeric=true;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"3");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"3");
                }
                isNumeric=true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"4");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"4");
                }
                isNumeric=true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"5");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"5");
                }
                isNumeric=true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"6");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"6");
                }
                isNumeric=true;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"7");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"7");
                }
                isNumeric=true;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"8");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"8");
                }
                isNumeric=true;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"9");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"9");
                }
                isNumeric=true;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsError){
                    solution.setText(solution.getText()+"0");
                    IsError=false;
                }else {
                    solution.setText(solution.getText()+"0");
                }
                isNumeric=true;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError&&!lastdot) {
                    solution.setText(solution.getText() + ".");
                    isNumeric = false;
                    lastdot = true;
                }
            }
        });
        fback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText()+"(");
            }
        });
        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText()+")");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError) {
                    solution.setText(solution.getText() + "+");
                    isNumeric = false;
                    lastdot = false;
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError) {
                    solution.setText(solution.getText() + "-");
                    isNumeric = false;
                    lastdot = false;
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError) {
                    solution.setText(solution.getText() + "*");
                    isNumeric = false;
                    lastdot = false;
                }}
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError) {
                    solution.setText(solution.getText() + "/");
                    isNumeric = false;
                    lastdot = false;
                }}
        });
        remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumeric&&!IsError) {
                    solution.setText(solution.getText() + "%");
                    isNumeric = false;
                    lastdot = false;
                }}
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(" ");
                answer.setText(" ");
                lastdot=false;
                IsError=false;
                isNumeric=false;
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word=solution.getText().toString();
                int input=word.length();
                if (input>0){
                    solution.setText(word.substring(0,input-1));
                }
            }
        });
        equalsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNumeric&&!IsError) {
                    String txt=solution.getText().toString();
                    Expression expression=new ExpressionBuilder(txt).build();
                    isNumeric = false;
                    try {
                        double result=expression.evaluate();
                        answer.setText(Double.toString(result));
                        lastdot=true;
                    }catch (ArithmeticException ex){
                        solution.setText("Error");
                        IsError=true;
                        isNumeric=false;
                    }
                }

            }
        });
    }
    public void getId(){
        solution=findViewById(R.id.SolutionButton);
        answer=findViewById(R.id.answerButton);
        back=findViewById(R.id.backSpaceimageButton);
        one=findViewById(R.id.button1);
        two=findViewById(R.id.button2);
        three=findViewById(R.id.button3);
        four=findViewById(R.id.button4);
        five=findViewById(R.id.button5);
        six=findViewById(R.id.button6);
        seven=findViewById(R.id.button7);
        eight=findViewById(R.id.button8);
        nine=findViewById(R.id.button9);
        zero=findViewById(R.id.button0);
        add=findViewById(R.id.buttonPlus);
        subtract=findViewById(R.id.buttonSubtraction);
        multiply=findViewById(R.id.buttonMultiplication);
        divide=findViewById(R.id.buttonDivide);
        clear=findViewById(R.id.clearButton);
        dot=findViewById(R.id.buttonDot);
        equalsTo=findViewById(R.id.buttonEquals);
        fback=findViewById(R.id.fBracketButton);
        bback=findViewById(R.id.bBracketButton);
        remainder=findViewById(R.id.buttonRemainder);
    }
}