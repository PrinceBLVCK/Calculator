package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zeroBtn,oneBtn, twoBtn,threeBtn,fourBtn,fiveBtn, sixBtn, sevenBtn,eightBtn,nineBtn;
    Button plusBtn, minusBtn, timesBtn, divideBtn, decimalPointBtn;
    Button equalBtn, cancelBtn, clearBtn, percentBtn;
    TextView activeView, inactiveView;

    double num1, num2;
    double answer = 0;
    char currentOperator =' ';
    private boolean isInteger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeBtns();

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"1");

                }
                else{
                    activeView.setText("1");
                }
                answer = 0;
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"2");
                }
                else{
                    activeView.setText("2");
                }
                answer = 0;
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"3");
                }
                else{
                    activeView.setText("3");
                }
                answer = 0;
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"4");
                }
                else{
                    activeView.setText("4");
                }
                answer = 0;
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"5");
                }
                else{
                    activeView.setText("5");
                }
                answer = 0;
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"6");
                }
                else{
                    activeView.setText("6");
                }
                answer = 0;
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"7");
                }
                else{
                    activeView.setText("7");
                }
                answer = 0;
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"8");
                }
                else{
                    activeView.setText("8");
                }
                answer = 0;
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"9");
                }
                else{
                    activeView.setText("9");
                }
                answer = 0;
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!activeView.getText().toString().equals("0")) && answer == 0){
                    activeView.setText(activeView.getText().toString()+"0");
                }
                else if (answer != 0){
                    activeView.setText("0");
                }
                answer = 0;
            }
        });
        decimalPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkDecimalPoint(activeView.getText().toString())){
                    activeView.setText(activeView.getText().toString()+".");
                }
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){

                    calculate();
                    if (checkForInteger(answer)){
                        int a = (int) answer;
                        inactiveView.setText("" + a);
                    }else{
                        inactiveView.setText("" + answer);
                    }
                    activeView.setText("0");
                }
                else if (inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){
                    inactiveView.setText(activeView.getText().toString());
                    activeView.setText("0");
                }
                currentOperator ='+';
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){

                    calculate();
                    if (checkForInteger(answer)){
                        int a = (int) answer;
                        inactiveView.setText("" + a);
                    }else{
                        inactiveView.setText("" + answer);
                    }
                    activeView.setText("0");
                }
                else if (inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){
                    inactiveView.setText(activeView.getText().toString());
                    activeView.setText("0");
                }
                currentOperator ='-';
            }
        });
        timesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){

                    calculate();
                    if (checkForInteger(answer)){
                        int a = (int) answer;
                        inactiveView.setText("" + a);
                    }else{
                        inactiveView.setText("" + answer);
                    }
                    activeView.setText("0");
                }
                else if (inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){
                    inactiveView.setText(activeView.getText().toString());
                    activeView.setText("0");
                }
                currentOperator ='*';
            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){

                    calculate();

                    if (checkForInteger(answer)){
                        int a = (int) answer;
                        inactiveView.setText("" + a);
                    }else{
                        inactiveView.setText("" + answer);
                    }
                    activeView.setText("0");
                }
                else if (inactiveView.getText().toString().isEmpty() && !activeView.getText().toString().equals("0")){
                    inactiveView.setText(activeView.getText().toString());
                    activeView.setText("0");
                }
                currentOperator ='/';
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!(inactiveView.getText().toString().isEmpty())){
                    calculate();

                    if (checkForInteger(answer)){
                        int a = (int) answer;
                        inactiveView.setText("");
                        activeView.setText("" + a);
                    }
                    else{
                        inactiveView.setText("");
                        activeView.setText("" + answer);
                    }
                }
            }

        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inactiveView.setText("");
                activeView.setText("0");
            }
        });





    }

    private boolean checkDecimalPoint(String str) {

        boolean a = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.'){
                return false;
            }
        }

        return a;
    }

    private void calculate() {
        if (!(inactiveView.getText().toString().isEmpty())){

            num1 = Double.parseDouble(inactiveView.getText().toString());
            num2 = Double.parseDouble(activeView.getText().toString());


            if (currentOperator == '+'){
                answer = num1 + num2;
            }
            if (currentOperator == '-'){
                answer = num1 - num2;
            }
            if (currentOperator == '*'){
                answer = num1 * num2;
            }
            if (currentOperator == '/'){

                answer = num1 / num2;
            }
        }
    }

    private void initializeBtns() {
        //number buttons
        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);

        //operational buttons
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        timesBtn = findViewById(R.id.timesBtn);
        divideBtn = findViewById(R.id.divideBtn);
        decimalPointBtn = findViewById(R.id.decimalPointBtn);

        //extra buttons
        cancelBtn = findViewById(R.id.cancelBtn);
        clearBtn = findViewById(R.id.clearBtn);
        equalBtn = findViewById(R.id.equalBtn);
        percentBtn = findViewById(R.id.percentBtn);

        //text views
        activeView = findViewById(R.id.activeView);
        inactiveView = findViewById(R.id.inactiveView);

    }

    private boolean checkForInteger(double a){
        int b = (int) a;
        if (a == b){
            return true;
        }
        else {
            return false;
        }
    }


}