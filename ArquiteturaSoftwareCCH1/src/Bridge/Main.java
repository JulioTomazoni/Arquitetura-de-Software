package Bridge;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new PedidoVenda(1, "João da Cunha", 100.00);
		pedido.salvar();
		Nota nota = new Nota(pedido);
		
		nota.Desconto(0.05);
		nota.Faturar("1", 1);
		nota.Enviar();
		
		pedido = new PedidoCompra(1, "Carlos Dal Pra", 300.00);
		pedido.salvar();
		nota = new Nota(pedido);
		
		nota.SomaJuros(10);
		nota.Faturar("2", 1);
		nota.Enviar();
	}

}
