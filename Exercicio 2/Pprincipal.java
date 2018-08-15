/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Victor Fernandes 
 */
public class Pprincipal {
    
 public static void main (String [] arg){
        Scanner input = new Scanner (System.in);
        
        Pais p1 = new Pais();
        Pais p2 = new Pais();
        Pais p3 = new Pais();
        p1.Pais("Brasil", "DF", 25, "França ");
        p2.Pais("França", "Paris", 10, "Brasil");
        p3.Pais("Brasil", "DF", 25, " França ");
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p2));
        
        }
        
        public boolean equals(final Pais p1){
            return false;
    } 
    
}
