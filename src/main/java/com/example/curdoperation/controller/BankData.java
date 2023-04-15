package com.example.curdoperation.controller;


public class BankData {

    private int bankid;
    private String name;
    private String location;

    public BankData(int bankid, String name, String location) {
        this.bankid = bankid;
        this.name = name;
        this.location = location;
    }

    public BankData() {
    }

    public int getBankid() {
        return bankid;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setBankid(int bankid) {
        this.bankid = bankid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankData{" +
                "bankid=" + bankid +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
