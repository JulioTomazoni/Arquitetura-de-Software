package Prototype;

public abstract class CelularPrototype {
	private String nome;
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	
	public CelularPrototype(String nome, String marca, String modelo, int ano, double valor) {
		this.setNome(nome);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setValor(valor);
	}
	
	public CelularPrototype clone() {
		return this;
	}
	
	public void Print(String newPrint) {
		System.out.println(
				" Celular = " +nome
			   +" Marca = " +marca
			   +" Modelo = " +modelo
			   +" Ano = " +ano
			   +" Valor = " +valor
			   +newPrint
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
