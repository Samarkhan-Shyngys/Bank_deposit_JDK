package com.company;

public class Deposit {
    String nameBank;
    int summa;
    double procent;
    int months;

    public Deposit(){
        this.summa = 0;
        this.procent = 10;
        this.months = 12;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int withdrawMoney(int money){
        this.summa = this.summa - money;
        return this.summa;
    };

    public int Money(int money){
        return this.summa;
    };

    public int addMoney(int money){
        this.summa = this.summa + money;
        return this.summa;
    }
}
