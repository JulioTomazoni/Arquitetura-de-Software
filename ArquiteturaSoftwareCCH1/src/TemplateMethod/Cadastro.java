package TemplateMethod;

public abstract class Cadastro {
	private int id;
	private String descricao;
	private boolean insert;
	
	public Cadastro(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;		
	}
	
	protected abstract void Insert();
	protected abstract void Update();
	protected abstract void Delete();
		
	public void Excluir() {
		if (ValidarExcluir()) {
			Delete();
		}
	}
	
	
	public void Salvar() {
		if (ValidarSalvar()) {  
			if (insert) {
				Insert();
			} else {
				Update();
			}
		}
	}
	
	protected boolean ValidarSalvar() {
		if ((id > 0) && (descricao != "")) {
			return true;
		} else {
			System.out.println("Id ou Descrição não preenchidos.");
			return false;
		}
	}
	
	protected boolean ValidarExcluir() {
		if (id > 0) {
			return true;
		} else {			
			return false;
		}
	}
	
	protected boolean getInsert() {
		return this.insert;
	}
	
	protected void setInsert(boolean value) {
		this.insert = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
