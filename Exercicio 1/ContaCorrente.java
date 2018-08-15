/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal1;

/**
 *
 * @author Victor Fernandes
 */
public class ContaCorrente {
    private int numero;
    private float saldo;
    private boolean status;
    private float limite = this.saldo * 4;

    public ContaCorrente(int numero) {
        this.numero = numero;
        this.saldo = 0;
        this.status = false;
    }

    public ContaCorrente(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = false;
    }

    public ContaCorrente(int numero, float saldo, boolean status) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public float getLimite() {
        return limite;
    }

    public ContaCorrente() {
    }
    
    public void pagarConta(float valor, int op){
        if (op == 1){
            if (valor <= this.limite){
            System.out.println("Operação de crédito realizada");
            this.limite -= valor; 
            }else{
                System.out.println("Limite insuficiente para a operação");
            } 
        }else if (op == 2){
            if (valor <= this.saldo){
                System.out.println("Operação de Débito realizada");
                this.saldo -= valor;
            }else{
                System.out.println("Saldo insuficiente para operação");
            }
        }else{
            System.out.println("Operação inválida");
        }
    }

    
    @Override
    public String toString() {
        return "ContaCorrente{" + "numero = " + numero + ", saldo = " + saldo + ", status = " + status + ", limite = " + limite + '}';
    }
    
    public float depositar(float valor){
        return this.saldo += valor;
    }
    
    public void sacar(float valor){
        if(valor >= this.saldo + this.limite){
             System.out.println("Não será possível realizar essa operação");
             
        }else{
            System.out.println("Saque realizado com sucesso");
            if (valor <= this.saldo){
                this.saldo -= valor;
            }else{
                this.limite -= (this.saldo - valor);
            }
        }
    }
}
