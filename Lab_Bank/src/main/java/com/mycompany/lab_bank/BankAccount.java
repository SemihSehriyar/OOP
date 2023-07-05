package com.mycompany.lab_bank;

import java.util.Comparator;


public class BankAccount{
    int accountNo;
    String holderName;
    double balance;
    
    BankAccount(int accountNo, String holderName, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
        this.holderName = holderName;
    }
    
    double balanceChange(double amount){
        return this.balance -= amount;
    }
    
    public String toString(){
        return this.accountNo+""+this.holderName+""+this.balance;
    }
   
}
class NameComp implements Comparator<BankAccount>{
    public int compare(BankAccount a1, BankAccount a2){
        return (int)(a1.balance - a2.balance);
    }     
}