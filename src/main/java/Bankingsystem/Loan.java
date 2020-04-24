/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankingsystem;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author meyer
 */

public class Loan {
    private double funds;
    private String loansecurity;
    public Loan(){
    
    }
    public Loan(double funds,String loansecurity){
    this.funds=funds;
    this.loansecurity=loansecurity;
    }
    
    public void setfunds(double funds){
    this.funds=funds;
    }
    
    public double getfunds(){
    return this.funds;
    }
    
    public void setsecurity(String loansecurity){
    this.loansecurity=loansecurity;
    }
    
    public void sendappointment(){
    System.out.println(LocalDate.now().plusDays(15));
    }
    
    
}
