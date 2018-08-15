
package atividade2;

/**
 *
 * @author Victor Fernandes 
 */
public class Pais {
    private String nome;
    private String capital;
    private float dimensao;
    private String pfront;

    public  void Pais(String nome, String capital, double dimensao, String paisfront) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = (float) dimensao;
        this.pfront= pfront ;
    }
    
   

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = (float) dimensao;
    }

    public String getPfront() {
        return pfront;
    }

    public void setPfront(String pfront ) {
        this. pfront =  pfront;
    }
    
    public void consulta(){
        System.out.println(getNome());
        System.out.println(getCapital());
        System.out.println(getDimensao());
        System.out.println(getPfront());
    }
    
   
}
