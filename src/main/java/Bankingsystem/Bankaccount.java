/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankingsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author meyer
 */
public abstract class Bankaccount {
    private String name;
    private int nationalnumber;
    private String mobilenumber;
    private String email;
    private LocalDate birthdate;
    private Loan loan;
    private String address;
    private String password;
    private String username;
    private double balance;
    private double interest;
    private double taxes;
    private LocalDate datecreated;
    private ArrayList<Transaction> transactions=new ArrayList<>();
    
    public void setName(String name){
    this.name=name;
    }
    
    public String getName(){
    return this.name;
    }
    
    public void setNationalNumber(int nationalnumber){
    this.nationalnumber=nationalnumber;
    }
    
    public int getNationalNumber(){
    return this.nationalnumber;
    }
    
    public void setUsername(String username){
    this.username=username;
    }
    
    public String getUsername(){
    return this.username;
    }
    
    public void setPassword(String password){
    this.password=password;
    }
    
    public void setBalance(double balance){
    this.balance=balance;
    }
    
    public double getBalance(){
    return this.balance;
    }
    
    public void setAddress(String address){
    this.address=address;
    }
    
    public String getAddress(){
    return this.address;
    }
    
    public void setMobileNumber(String mobilenumber){
    this.mobilenumber=mobilenumber;
    }
    
    public String getMobileNumber(){
    return this.mobilenumber;
    }
    
    public void setEmail(String email){
    this.email=email;
    }
    
    public String getEmail(){
    return email;
    }
    
    public void setBirthdate(LocalDate birthdate){
    this.birthdate=birthdate;
    }
    
    public LocalDate getBirthDate(){
    return this.birthdate;
    }
    
    public abstract double calculateIntereset();
    public abstract double calculateTaxes();
    
    public void setDateCreated(LocalDate datecreated){
    this.datecreated=datecreated;
    }
    
    public LocalDate getDateCreated(){
    return this.datecreated;
    }
    
    public void transferFunds(double funds,Bankaccount bankaccount){
     if (funds<= this.balance) {
        this.balance=this.balance-funds;
         bankaccount.balance=(bankaccount.balance)+funds;
         Transaction tmp = new Transaction( funds);
         transactions.add(tmp);
    }
     else{
            System.out.println("Not sufficient balance");
        }
    
    }
    
    public void requestLoan(char c,double funds,String loansecurity){
    if (c=='c'||c=='C')
        {
            System.out.println("Enter the car type:");
            Scanner sc=new Scanner(System.in);
            String cartype=sc.next();
            this.loan= new Carloan(funds,loansecurity,cartype);
        }
    else if (c=='p'|| c=='P') 
        {
             System.out.println("Enter area:");
            Scanner sc=new Scanner(System.in);
            double area=sc.nextDouble();
            System.out.println("Enter address:");
            Scanner sc1=new Scanner(System.in);
            String address1=sc.next();
            this.loan= new Premises(funds,loansecurity,area,address1);
        }
    else if(c=='i'||c=='I')
    {
         System.out.println("Enter chance of success:");
            Scanner sc=new Scanner(System.in);
            double chanceofsuccess=sc.nextDouble();
            this.loan= new Project(funds,loansecurity,chanceofsuccess);
    }
    }
    
    public Loan getLoan(){
    return this.loan;
    }
    
    public void requestCard(){
    //Send to the management that the user is requesting a card
        //Management sends back the time of arrival of the card
    }
    public void displayTransaction(){
       for (Transaction t : transactions) {
            t.viewtransaction();
        }
    }
    
    public void sendNotification(){
    
    }
    
    public void support(){
    //GUI
    }
    public void mbs(){
        
    }
}