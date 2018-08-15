package Exer03;

import java.util.ArrayList;

public class Edificio extends Imovel {


	private int totalDeAndares;
	
	
	
	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public void adicionarAndar(){
		this.totalDeAndares++;
	}
	
	public void adicionarPorta(Porta portas) {
		this.portas.add(portas);
	}
	
	public int quantasPortasEstaoAbertas(){
		int cont = 0;
		for(int i = 0; i < portas.size(); i++){
			if (portas.get(i).isAberta() == true){
				cont++;
			}
		}
		return cont;
	}

	public int totalPortas(){
		return portas.size();
	}
	
	public void pinta(String cor){
		this.cor = cor;
	}
}
