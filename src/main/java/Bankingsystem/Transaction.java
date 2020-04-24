/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankingsystem;
import java.time.LocalDate;

/**
 *
 * @author meyer
 */
public class Transaction {
    private LocalDate date;
    private String description;
    private double funds;
    
public Transaction(double funds)
{
     this.funds = funds;
     this.date= LocalDate.now();
}
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }
    
    public void setdescription(String description){
    this.description=description;
    }
    
    public String getdescription(){
    return this.description;
    }
    
    public void setdate(){
    this.date= LocalDate.now();
    }
    
    public LocalDate getdate(){
    return this.date;
    }
    
    public void viewtransaction(){
    System.out.println("User's description:"+description);
    System.out.println("Date of the transaction:"+date);
    System.out.println("Funds tranferred:"+funds);
    }
}
