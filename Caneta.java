package IntroPOO;

public class Caneta {
	//ATRIBUTOS -> CARACTERISTICAS
	 private String cor;
	 private double ponta;
	 private int carga;
	 private boolean tampada;
	
	//METODO CONSTRUTOR
	
	public Caneta(String c, double p)
	{
		this.cor=c;
		this.ponta=p;
		this.carga=100;
		this.tampada=true;
	}
	
	//METODOS ACESSORES E MODIFICADORES
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		if(carga>100 || carga<0)
			System.out.println("Valor invalido");
		else
			this.carga = carga;
	}

	public String getCor() {
		return cor;
	}

	public double getPonta() {
		return ponta;
	}
	
	//METODOS -> COMPORTAMENTOS
	
	public void tampar()
	{
		if(this.tampada==true)
			System.out.println("ERRO! A caneta ja esta tampada");
		else
			this.tampada=true;
	}
	
	public void destampar()
	{
		if(this.tampada==false)
			System.out.println("ERRO! A caneta ja esta destampada");
		else
			this.tampada=false;
	}
	
	public void escrever()
	{
		if(this.tampada==true || this.carga==0)
			System.out.println("ERRO! Nao e possivel escrever...");
		else
			System.out.println("Escrevendo...");
	}
	
	public void estado()
	{
		System.out.println("A cor da caneta e: "+ this.cor);
		System.out.println("A ponta e: "+ this.ponta);
		System.out.println("A carga esta em "+this.carga+"%");
		System.out.println("A caneta esta tampada?"+this.tampada);
	}
}
