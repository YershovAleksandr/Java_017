package com.nam.strategy_pattern;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1 - num2;
    }
}
