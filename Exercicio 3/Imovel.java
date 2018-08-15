package Exer03;

import java.util.ArrayList;

public abstract class Imovel {
	protected ArrayList<Porta> portas = new ArrayList();
	protected String cor;
	
	public abstract int quantasPortasEstaoAbertas();
	public abstract int totalPortas();
	public abstract void pinta(String cor);
}
