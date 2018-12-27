/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ContaCorrente {
    
    private double saldo;
    private double deposito;
    private double sacar;
    
    
    
    
    
    public double valorInicial(){
        String valor = JOptionPane.showInputDialog("INSIRA O VALOR DE DEPOSITO PARA ABRIR A CONTA");
        double valorDeposito = Double.parseDouble(valor);
        
        
        this.saldo = valorDeposito;
        System.out.println(valorDeposito);
        
        return this.saldo;
        
    }
    
    
    
    public double verSaldo(){
        
        return this.saldo;
    }
    
    
    public double depositar(double valorDeposito){
        this.saldo += valorDeposito;
        JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO: R$ "+valorDeposito);
         JOptionPane.showMessageDialog(null, "SALDO ATUALIZADO: R$ "+ this.saldo);
        
        return this.saldo;
        
        
        
    }
    
    
    public double sacarDaConta(double valorSaque){
        
        if(valorSaque > this.saldo){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE","MENSAGEM", JOptionPane.ERROR_MESSAGE);
        }else{
            this.saldo -= valorSaque;
            JOptionPane.showMessageDialog(null, "SAQUE REALIZADO: R$: " + valorSaque);
            
        }
         
        return this.saldo;
    }
    
    
    
    
    
    
    
}
