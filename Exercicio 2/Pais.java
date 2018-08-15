/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02;

import java.util.ArrayList;

/**
 *
 * @author Victor Fernandes
 */
public class Pais {
    private String nome;
    private String capital;
    private float dimensao;
    private ArrayList n = new ArrayList();
    private String fronteira;
    
    public Pais(String nome, String capital, float dimensao){
        this.capital = capital;
        this.nome = nome;
        this.dimensao = dimensao;          
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getDimensao() {
        return dimensao;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean equals(Pais pais, Pais pais2){
        if(pais == pais2){
            return true;
        }else
        return false;
    }
    
    public void fronteiras(String pais){
        this.fronteira = pais;
        n.add(this.fronteira);
    };
    
    public void todasFronteiras(){
        System.out.println(n);
    }
    
    public void vizinhosComuns(Pais pais){
        if (this.n.equals(pais.n)){
        System.out.println(pais.n);
                }
    }
}
