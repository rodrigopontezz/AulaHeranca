package br.com.loja;

public class ClienteInternet extends Cliente implements Usuario {
	
	private int carrinho[];
	private String email;
	
	public int[] getCarrinho() {
		
		
		
		return carrinho;
	}
	public void setCarrinho(int[] carrinho) {
		this.carrinho = carrinho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void autenticar(){
		
	}
	
}
