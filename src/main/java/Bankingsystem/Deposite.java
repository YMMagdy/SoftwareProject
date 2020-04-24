/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankingsystem;

/**
 *
 * @author Leo
 */
public class Deposite extends Bankaccount {
    @Override
    public double calculateIntereset(){
    return (super.getBalance()*0.14);
    }
    
    @Override
    public double calculateTaxes(){
        return (super.getBalance()*0.028);
    }
}
