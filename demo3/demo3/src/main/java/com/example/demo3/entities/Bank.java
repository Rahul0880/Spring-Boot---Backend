package com.example.demo3.entities;

public class Bank {

    private long accno;

    private String name;

    private float balance;
    private long ph_no;
    private String email;

    public long getPh_no() {
        return ph_no;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bank(long accno, String name, float balance, long ph_no, String email) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
        this.ph_no = ph_no;
        this.email = email;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
