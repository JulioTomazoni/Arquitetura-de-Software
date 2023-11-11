package Bridge;

public class Nota {
	private String serie;
	private int numNota;
	private double valor;
	private String cliente;
	protected char operacao;
	protected Pedido pedido;
	
	public Nota(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public double SomaJuros(int diasAtraso) {
		valor = pedido.getValor() + (pedido.getValor() * 0.02 * diasAtraso);
		return valor;
	}
	
	public double Desconto(double perDesconto) {
		valor = pedido.getValor() - (pedido.getValor() * perDesconto);
		return valor;
	}
	
	public void Faturar(String serie, int numNota) {
		this.serie = serie;
		this.numNota = numNota;
		operacao = pedido.getOperacao();
		cliente = pedido.getCliente();	

		String descOperacao;
		
		if (operacao == 'S') {
			descOperacao = "Saída";
		} else {
			descOperacao = "Entrada";
		}
		
		if (valor > 0) {			
			System.out.println("Nota de " +descOperacao +" Faturada no valor de R$ " +valor +"!");
		} else {
			valor = pedido.getValor();
			
			if (valor > 0) {
				System.out.println("Nota de " +descOperacao +" Faturada no valor de R$ " +valor +"!");
			} else {
				System.out.println("Valor da nota inválida!");
			}
		}
	}
	
	public void Enviar() {
		String descOperacao;
		
		if (operacao == 'S') {
			descOperacao = "Saída";
		} else {
			descOperacao = "Entrada";
		}
		
		System.out.println("Nota de " +descOperacao +" enviada! Foi enviado o email para o Cliente: " +cliente);
	}
	
	public String getCliente() {
		return pedido.getCliente();
	}
	
	public double getValor() {
		return pedido.getValor();
	}
	
	public String getSerie() {
		return serie;
	}
	
	public int getNumNota() {
		return numNota;
	}

	public char getOperacao() {
		return pedido.getOperacao();
	}
}
