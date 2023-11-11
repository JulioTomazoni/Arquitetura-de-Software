package Bridge;

public interface Pedido {
	public int getNumero();
	public String getCliente();
	public double getValor();
	public char getOperacao();
	public void salvar();
}
