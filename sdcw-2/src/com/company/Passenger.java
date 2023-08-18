package com.company;

public class Passenger {

    private String first_name;
    private String sur_name;
    private double expenses;
    private double total_expenses;


    public Passenger(){
        first_name="first_name";
        sur_name="sur_name";
        expenses=0.0;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}

