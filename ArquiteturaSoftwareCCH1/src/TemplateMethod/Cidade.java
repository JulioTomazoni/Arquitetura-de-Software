package TemplateMethod;

public class Cidade extends Cadastro {
	private String cep;
	
	public Cidade(int id, String descricao, String cep) {
		super(id, descricao);
		this.cep = cep;
	}

	@Override
	protected void Insert() {
		System.out.println("Cidade Inserida.");
	}

	@Override
	protected void Update() {
		System.out.println("Cidade Editada.");
	}

	@Override
	protected void Delete() {
		setId(0);
		setDescricao("");
		cep = "";
		System.out.println("Cidade Excluída.");
	}
	
	@Override
	protected boolean ValidarSalvar() {
		boolean bReturn = true;
		
		if (!super.ValidarSalvar()) {			
			bReturn = false;
		}
		
		if (bReturn) {
			if (cep.length() != 8) {
				System.out.println("CEP deve possuir 8 dígitos!");
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
			System.out.println("Cidade inválido.");
			return false;
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) throws Exception {
		if (cep.length() != 8) {
			throw new Exception("CEP deve possuir 8 dígitos!");
		}
		
		this.cep = cep;
	}

}
