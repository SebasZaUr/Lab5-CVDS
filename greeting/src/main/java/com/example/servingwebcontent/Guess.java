package com.example.servingwebcontent;

import java.util.Random;

public class Guess {
    private int number;
    private int monto;

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumber() {
        return number;
    }
    public Guess(){
        Random random = new Random();
        number= random.nextInt(10) + 1;
        monto = 100000;
    }
    public void setNumber(int number) {
        this.number = number;
    }

}
