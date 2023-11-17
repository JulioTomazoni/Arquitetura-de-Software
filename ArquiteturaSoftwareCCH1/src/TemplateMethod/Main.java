package TemplateMethod;

public class Main {

	public static void main(String[] args) {
		Item item = new Item(1, "Pão", 0.5);
		item.setInsert(true);
		item.Salvar();
		item.Excluir();
		
		item = new Item(0, "Nutella", 15.00);
		item.setInsert(false);
		item.Salvar();
		item.Excluir();
		
		Cidade cidade = new Cidade(1, "Dois Vizinhos", "85660000");
		cidade.setInsert(true);
		cidade.Salvar();
		cidade.Excluir();

		cidade = new Cidade(2, "Francisco Beltrão", "200400");
		cidade.setInsert(false);
		cidade.Salvar();
		cidade.Excluir();		
	}

}
