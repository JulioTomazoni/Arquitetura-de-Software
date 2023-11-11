package Prototype;

public class IPhone extends CelularPrototype {
	private String SO;

	public IPhone(String nome, String marca, String modelo, int ano, double valor) {
		super(nome, marca, modelo, ano, valor);
		SO = "IOS";
	}

	public String getSO() {
		return SO;
	}
	
	@Override
	public IPhone clone() {
		return new IPhone(this.getNome(), this.getMarca(), this.getModelo(), getAno(), getValor());
	}

}
