package com.company;

public class Polzovatel {
    private Banks banks = new HalykBank();
    private String surname;
    private String name;
    private int IIN;
    private int age;
    private Deposit deposit = new Deposit();

    public Polzovatel(){

    }

    public Polzovatel(Banks banks, String surname, String name, int IIN, int age) {
        this.banks = banks;
        this.surname = surname;
        this.name = name;
        this.IIN = IIN;
        this.age = age;
    }

    public Banks getBanks() {
        return banks;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public void setBanks(Banks banks) {
        this.banks = banks;
        this.deposit.setProcent(banks.getprocent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIIN() {
        return IIN;
    }

    public void setIIN(int IIN) {
        this.IIN = IIN;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "IIN: " + IIN + "\n" +
                "Age: " + age + "\n" +
                "Deposit summa: " + deposit.getSumma() + "\n" +
                "Deposit months: " + deposit.getMonths() + "\n" +
                "Deposit procent: " + deposit.getProcent() + "\n" +
                "Deposit Prediction: " + banks.getPrediction(deposit.getMonths(), deposit.getSumma());
    }
}
