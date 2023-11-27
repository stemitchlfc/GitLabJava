package com.project;

public class DollarADay {
    public int calculateTotal(int days){
        int total = 0;
        for(int i = 1; i<=days; i++){
            total += i;
        }
        return total;
    }
}