package Exer03;

public class Principal {

	public static void main(String[] args) {
		 
		//Exercício A) porta
		 Porta p = new Porta();
		 
		 System.out.println(p.toString());
		 
		 p.abre();
		 p.pintar("Verde");
		 p.setDimensaoX(0.70f);
		 p.setDimensaoY(2.50f);
		 p.setDimensaoZ(0.20f);
		 p.estaAberta();
		 
		 System.out.println(p.toString());
		 
		 //Exer B)  Casa
		 
		Casa c = new Casa();
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		p1.abre();
		p2.abre();
		c.setPortas(p1);
		c.setPortas(p2);
		c.setPortas(p);
		
		System.out.println("Portas abertas = "+c.quantasPortasEstaoAbertas());
		System.out.println("Total de portas = "+c.totalPortas());
		
		//Exerc c) Edifício
		
		Edificio e = new Edificio();
		
		Porta pe = new Porta();
		pe.abre();
		Porta pe1 = new Porta();
		Porta pe2 = new Porta();
		Porta pe3 = new Porta();
		pe3.abre();
		Porta pe4 = new Porta();
		Porta pe5 = new Porta();
		e.adicionarAndar();
		e.adicionarAndar();
		System.out.println("Portas abertas = "+c.quantasPortasEstaoAbertas());
		System.out.println("Total de portas = "+c.totalPortas());
		System.out.println("andares = " + e.getTotalDeAndares());
	}

}
