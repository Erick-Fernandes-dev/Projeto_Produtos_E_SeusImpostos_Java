package entities;

import interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int quantPaginas;

	public Livro() {
		this("", 0.0, 0, "", "", 0);

	}

	public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantPaginas) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantPaginas = quantPaginas;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantPaginas() {
		return quantPaginas;
	}

	public void setQuantPaginas(int quantPaginas) {
		this.quantPaginas = quantPaginas;
	}

	@Override
	public double calculaImposto() {
		double imposto = 0.0;

		if (this.tema.equalsIgnoreCase("Educativo")) {
			imposto = 0.0;
			System.out.println("Livros educativos não pagam Impostos");
		} else {
			imposto = super.getPreco() * 0.10;
		}

		return imposto;
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("\nNome: " + super.getNome() + "\n");
		str.append("Preço: " + super.getPreco() + "\n");
		str.append("Quantidade: " + super.getQuantidade() + "\n");
		str.append("Nome do autor: " + this.autor + "\n");
		str.append("Tema: " + this.tema + "\n");
		str.append("Quantidade de páginas: " + this.quantPaginas + "\n");
		str.append("O imposto do livro " + super.getNome() + " é de R$ " + String.format("%.2f", calculaImposto()));
		
		return str.toString();

	}

}
