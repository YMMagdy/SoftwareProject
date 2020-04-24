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
public class Project extends Loan{
    private double percentageofsuccess;
    
    public Project(){
    
    }
    
    public Project(double funds,String loansecurity,double percentageofsuccess){
    super(funds,loansecurity);
    this.percentageofsuccess=percentageofsuccess;
    }
    
    public void setpercentage(double percentageofsuccess){
    this.percentageofsuccess=percentageofsuccess;
    } 
    
    public double getpercentage(){
    return this.percentageofsuccess;
    }
    
}
