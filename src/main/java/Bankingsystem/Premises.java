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
public class Premises extends Loan {
    private double area;
    private String address;
    
    public Premises(){
    
    }
    
    public Premises(double funds,String loansecurity,double area,String address){
    super(funds,loansecurity);
    this.area=area;
    this.address=address;
    }
    
    public void setarea(double area){
    this.area=area;
    }
    
    public double getarea(){
    return this.area;
    }
    
    public void setaddress(String address){
    this.address=address;
    }
    
    public String getaddress(){
    return this.address;
    }
}
