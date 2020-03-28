package leyser;


public class PontoApp {

	public static void main(String[] args) {
		Ponto ponto = new Ponto(2.5f,1.6f);
		Ponto ponto1 = new Ponto(2.5f,2.6f);
		
		ponto.mostrar();
		ponto1.mostrar();
		//Retangulo r;
		//Retangulo[] r2 = new Retangulo[2];
		//r = new Retangulo();
		//r2[0]= new Retangulo();
		//System.out.println(r2[0]);
		System.out.println(ponto.distancia(ponto1));

	}

}
