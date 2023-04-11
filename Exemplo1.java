package IntroPOO;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Caneta bic = new Caneta("Roxa", 0.5);
		int x=5;
	//	bic.cor="rosa";
	//	bic.cor="azul";
	//	bic.carga=10;
	//	bic.ponta=0.7;
		System.out.println("Digite a qtd de carga");
		bic.setCarga(ler.nextInt());
		//bic.setCarga(300);
		System.out.println("A carga da caneta esta em "+bic.getCarga()+"%");
		System.out.println("a cor da caneta é: "+bic.getCor());
		System.out.println("O valor de x e: "+x);

	}

}
