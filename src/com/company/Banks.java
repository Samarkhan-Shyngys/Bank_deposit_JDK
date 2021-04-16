package com.company;

abstract class Banks{
    public double procent;
    public String name;


    public String getName(){
        return this.name;
    };


    public double getprocent(){
        return this.procent;
    };

    public double getPrediction(int month, int summa){
        double res = Math.pow((1 + this.procent/100),month/12.0);
        return summa * res;
    };

};