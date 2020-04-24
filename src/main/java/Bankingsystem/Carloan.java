/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankingsystem;

/**
 *
 * @author meyer
 */
public class Carloan extends Loan{
    private String cartype;
    
    public Carloan(){
    
    }
    
    public Carloan(double funds,String loansecurity,String cartype){
    super(funds,loansecurity);
    this.cartype=cartype;
    }
    
    public void setcartype(String cartype){
    this.cartype=cartype;
    }
    
    public String getcartype(){
    return this.cartype;
    }
    
    
}
