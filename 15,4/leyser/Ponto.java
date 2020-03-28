package leyser;


public class Ponto {
	
	private float Pontox;
	private float Pontoy;
	
	
	public Ponto(float pontox, float pontoy) {
		super();
		Pontox = pontox;
		Pontoy = pontoy;
	}
	public Ponto(Ponto ponto) {
		super();		
		Pontox = ponto.Pontox;
		Pontoy = ponto.Pontoy;
		
	}
	
	public void mostrar() {
		System.out.printf("O ponto X %.1f e o ponto Y %.1f\n",Pontox,Pontoy);
		
	}
	
	public float distancia(Ponto ponto) {
		return (float) Math.sqrt((this.Pontox - ponto.Pontox)*(this.Pontox - ponto.Pontox)+(this.Pontoy - ponto.Pontoy)*(this.Pontoy - ponto.Pontoy));
		
	}
	
	public String toString() {
		return String.format("(%s,%s)", this.Pontox, this.Pontoy);
	}
	
	public float getPontox() {
		return Pontox;
	}
	public void setPontox(float pontox) {
		Pontox = pontox;
	}
	public float getPontoy() {
		return Pontoy;
	}
	public void setPontoy(float pontoy) {
		Pontoy = pontoy;
	}


	
}
