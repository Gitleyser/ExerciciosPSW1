package leyser;


public class Retangulo {
	private Ponto p1;
	private Ponto p2;
	private Ponto p3;
	private Ponto p4;
	
	public Retangulo () {
		p1= new Ponto (2,2);
		p2= new Ponto (2,3);
		p3= new Ponto (3,3);
		p4= new Ponto (3,2);
		
	}
	
	public String toString () {
		return String.format("[%S,%s,%S,%S]", p1,p2,p3,p4);
	}

}
