package IntroPOO;

public class Carro {
	//ATRIBUTOS
	private String marca;
	private String modelo;
 	private int ano;
	private int velocidade=0;
	private int marcha=0;
	private boolean ligado;
	
	//METODOS
	
	public void ligar()
	{
		if(this.ligado==false && this.marcha==0)
			this.ligado=true;
		else
			System.out.println("ERRO, verifique se o carro esta desligado e em ponto morto");
	}
	
	public void desligar()
	{
		if(this.ligado==true && this.velocidade==0)
			this.ligado=false;
		else
			System.out.println("ERRO impossível desligar nesse momento");
	}
	
	public void acelerar()
	{
		if(this.ligado==true && this.marcha>0)
			this.velocidade++; // => this.velocidade=this.velocidade+1;
		else
			System.out.println("Verifique a marcha e se o carro esta ligado");
	}
	
	public void freiar()
	{
		if(this.ligado==true && this.velocidade>0)
			this.velocidade--;
		else
			System.out.println("O carro ja esta parado");
		
	}
	
	public void aumentarMarcha()
	{
		if(this.ligado==true && this.marcha<5)
			this.marcha++;
		else
			System.out.println("Verifique se o carro esta ligado e a marcha atual");
	}
	
	public void diminuirMarcha() {
		if(this.ligado==true &&this.marcha>0)
			this.marcha--;
		else
			System.out.println("Verifique se o carro esta ligado e a marcha atual");
	}
	
	public void estado()
	{
		System.out.println("A marca do carro e: "+this.marca);
		System.out.println("O modelo do carro e: "+this.modelo);
		System.out.println("Ano de fabricacao: "+this.ano);
		System.out.println("O carro esta ligado? "+this.ligado);
		System.out.println("O carro esta na "+this.marcha+"ª marcha");
		System.out.println("O carro esta a "+this.velocidade+"Km/h");
	}
}











