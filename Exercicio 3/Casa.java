package Exer03;

import java.util.ArrayList;

public class Casa extends Imovel{
	
	//private ArrayList<Porta> portas = new ArrayList();

	public ArrayList<Porta> getPortas() {
		return portas;
	}
	public void setPortas(Porta portas) {
		this.portas.add(portas);
	}
	public Casa(){
		
	}
	public void pinta(String cor){
		this.cor = cor;
	}
	public String getCor() {
		return cor;
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
	
}
