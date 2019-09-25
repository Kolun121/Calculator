package com.example.calculator;

import android.widget.EditText;

import java.io.IOException;

public class Calculator {
    public int first;
    public String operation;
    public int second;

    public Calculator(){
        first = 0;
        operation = "";
        second = 0;
    }

    public int calculate() throws  Exception{
        if (operation.equals("С")){
            return 0;
        } else if(operation.equals("+")){
            return first + second;
        } else if(operation.equals("-")){
            return first - second;
        } else if(operation.equals("*")){
            return first * second;
        } else if(operation.equals("/")){
            return first / second;
        } else if(operation.equals("=")){
            return first;
        } else if (operation.isEmpty()) {
            return second;
        }else {
            throw new IOException();
        }
    }
}
