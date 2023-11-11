package Bridge;

public class PedidoVenda implements Pedido {
	private String cliente;
	private int numero;
	private double valor;
	private char operacao;
	
	public PedidoVenda(int numero, String cliente, double valor) {
		this.numero = numero;
		this.cliente = cliente;
		this.valor = valor;
		this.operacao = 'S';
	}

	@Override
	public int getNumero() {
		return numero;
	}

	@Override
	public String getCliente() {
		return cliente;
	}

	@Override
	public double getValor() {
		return valor;
	}

	@Override
	public void salvar() {
		System.out.println("Pedido Salvo com número: " +numero +" Cliente: " +cliente);
	}

	@Override
	public char getOperacao() {
		return operacao;
	}
	
	
}
