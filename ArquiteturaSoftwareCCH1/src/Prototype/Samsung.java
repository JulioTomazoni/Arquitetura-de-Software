package Prototype;

public class Samsung extends CelularPrototype{
	private String SO;

	public Samsung(String nome, String marca, String modelo, int ano, double valor) {
		super(nome, marca, modelo, ano, valor);
		SO = "Android";
	}

	public String getSO() {
		return SO;
	}
	
	@Override
	public Samsung clone() {
		return new Samsung(this.getNome(), this.getMarca(), this.getModelo(), getAno(), getValor());
	}

}
