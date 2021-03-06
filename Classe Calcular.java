package Calculos;

public class Calcular {
	private int contador=0,contador2=0,separar=0;
	private double preco=0,media=0;
	
	public void setContador2(int contador2) {
		this.contador2=contador2;
	}
	public void setSeparar(int separar) {
		this.separar=separar;
	}
	public void setContador(int contador) {
		this.contador=contador;
	}	
		
	public void setPreco(double preco) {
		this.preco=preco;
	}
	public void setMedia(double media) {
		this.media=media;
	}
	
	public int getContador() {
		return contador;
	}
	public int getContador2() {
		return contador2;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getMedia() {
		return media;

	}
	
	public int getSeparar() {
		return separar;

	}
////////////////////////////////////////////////////////////////////////////////
	public void Calcular_infeior_40(double preco_prod){
		
		if(preco_prod<40)
			contador++;
		
	}
	
	public void Calcular_Entre40_100(double preco_prod) {
		
		if(preco_prod>40&&preco_prod<100) {	
			separar=1;
		}else {
			separar=0;
		}
	}
	public void Media_maior_100(double preco_prod) {
		
		if(preco_prod>100) {
			contador2++;
			media+=preco_prod;	
		}
		
	}	
	public void Media_100() {
		if(contador2!=0)
		media/=contador2;
		
	}
}
