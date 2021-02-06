package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, double preco, int quantidade) {

		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		this("", 0.0, 0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
