package Prototype;

public class Main {

	public static void main(String[] args) {
		Samsung celular_samsung = new Samsung("Samsung S20", "Samsung", "S20", 2023, 1590.90);
		IPhone  celular_iphone = new IPhone("IPhone 11", "IPhone", "11", 2021, 2750.90);

		CelularPrototype celular_novo; 
		celular_novo = celular_samsung.clone();		
		celular_novo.Print(" Sistema Operacional = " +((Samsung) celular_novo).getSO());
		celular_novo = celular_iphone.clone();
		celular_novo.Print(" Sistema Operacional = " +((IPhone) celular_novo).getSO());

	}

}
