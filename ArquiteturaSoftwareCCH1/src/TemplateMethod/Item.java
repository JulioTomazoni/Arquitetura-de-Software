package TemplateMethod;

public class Item extends Cadastro {
	private double valor;
	
	public Item(int id, String descricao, double valor) {
		super(id, descricao);
		this.valor = valor;
	}

	@Override
	protected void Insert() {
		System.out.println("Item Inserido.");
	}

	@Override
	protected void Update() {
		System.out.println("Item Editado.");
	}

	@Override
	protected void Delete() {
		setId(0);
		setDescricao("");
		valor = 0;
		System.out.println("Item Excluído.");
	}

	@Override
	protected boolean ValidarSalvar() {
		boolean bReturn = true;
		
		if (!super.ValidarSalvar()) {			
			bReturn = false;
		}
		
		if (bReturn) {
			if (valor <= 0) {
				bReturn = false;
			}
		}
		
		return bReturn;
	}

	@Override
	protected boolean ValidarExcluir() {
		if (super.ValidarExcluir()) {
			return true;
		} else {
			System.out.println("Item inválido.");
			return false;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
