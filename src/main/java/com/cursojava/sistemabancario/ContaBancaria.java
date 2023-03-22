
package com.cursojava.sistemabancario;


public class ContaBancaria {
    
    private String numeroConta;
    private double agencia;
    private double saldo;
    private Cliente titular; // classe sendo tipo

   
   /*
     setar esse atributo total como static, é dizer que ele pertence á classe (ContaBancaria)
    e não ao objeto. Todo objeto do tipo ContaBancaria, tem acesso a um único total.
    */
    private static int total;
    
   
    
    
    /*
     Construtor é uma rotina de inicialização.Serve bem para criar regra de negocio
     especificando funcionalidades obrigatorias. Tem a construção do que se quer no objeto
     pode receber parâmetros. Popula os atributos
    */
    
    public ContaBancaria(double agencia, String numeroConta)
    {
        //usando atributo total para incrementar novas contas bancárias
        total++;
        System.out.println("O total de contas é: " +total);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        System.out.println("estou testando o construtor");
    }

    ContaBancaria() {
        
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        
        this.numeroConta = numeroConta;
    }

    public double getAgencia() {
        return agencia;
    }

    
     public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        ContaBancaria.total = total;
    }
    public void setAgencia(double agencia) {
        // validando valor da agencia apenas se for maior que zero
        if(agencia <= 0)
        {
            System.out.println("não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor)
    {
         this.saldo+=valor;
    }
    
    // validando se tem saldo suficiente para sacar. Tem saldo? ok! Não tem? não saca.
    public boolean  sacar(double valor)
    {
         if(this.saldo >= valor)
         {
             this.saldo -= valor;
             return true;
         } 
             return false;
         
        
    }
    
    /* método para transferir um valor de uma conta para outra.
     valida se tem saldo, se tiver debita do saldo o valor e em destino 
    deposita esse mesmo valor.*/
    public boolean transferir(double valor, ContaBancaria destino)
    {
        if(this.saldo >= valor)
                {
                    this.saldo -= valor;
                    destino.depositar(valor);
                    return true;
                }
        return false;
        
    }
    
    
}
