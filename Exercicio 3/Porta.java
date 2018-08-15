package Exer03;

public class Porta {
	private boolean aberta;
	private String cor;
	private float dimensaoX;
	private float dimensaoY;
	private float dimensaoZ;
	
	public Porta(){
		this.cor = "Marrom";
		this.aberta = false;
		this.dimensaoY = 2.10f;
		this.dimensaoX = 0.60f;
		this.dimensaoZ = 0.10f;
	}
	
	public void abre(){
		this.aberta = true;
	}
	public void fecha(){
		this.aberta = false;
	}
	
	public void pintar(String cor){
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Porta [aberta=" + aberta + ", cor=" + cor + ", dimensaoX=" + dimensaoX + ", dimensaoY=" + dimensaoY
				+ ", dimensaoZ=" + dimensaoZ + "]";
	}

	public boolean estaAberta(){
		if (aberta == false){
			System.out.println("A porta está fechada");
			return false;
		}else {
			System.out.println("A porta está aberta");
			return true;
		}
	}

	public float getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public float getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public float getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(float dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
}
