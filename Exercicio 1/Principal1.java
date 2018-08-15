/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Fernandes
 */
public class principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ContaCorrente> clientes = new ArrayList<>();
        ContaCorrente cliente = new ContaCorrente();
        
      
        
        while (true){
        System.out.println("========================================");
        System.out.println("Qual operação você deseja realizar?");
        System.out.println("[1] abrir uma conta\n[2] Depositar\n[3] Sacar um valor\n[4] Ver extrato\n[5] Sair");
        System.out.println("=========================================");
        int n = input.nextInt();
        switch(n){
            case 1:
                clientes.add(cliente);
                System.out.println(clientes);
                break;
            case 2:
                System.out.println("Informe o falor que deseja depositar");
                float deposito = input.nextFloat();
                cliente.depositar(deposito);
                break;
            case 3:
                System.out.println("Qual o valor que você deseja sacar?");
                float sacar = input.nextFloat();
                cliente.sacar(sacar);
            case 4:
                System.out.println(cliente.toString());
                break;
        }
            if (n >= 5 ){
                break;
            }
        }
    }
    
}
