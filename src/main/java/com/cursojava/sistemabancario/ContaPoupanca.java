
package com.cursojava.sistemabancario;


public class ContaPoupanca extends ContaBancaria {
    
    
    // Construtores não são herdados da super classe para classes filhas. é preciso criá-los.
    public ContaPoupanca(double agencia, String numeroConta)
    {
        super(agencia,numeroConta);
    }
    
    
    
    
}
