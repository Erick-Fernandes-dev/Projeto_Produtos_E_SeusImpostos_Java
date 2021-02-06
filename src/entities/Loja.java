package entities;

import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	public Loja() {
		this("", "", null, null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaDeLivros() {
		
		for (Livro l : livros) {
			
			if (l == null) {
				System.out.println("A loja não tem livros no seu estoque");
			}
			
			System.out.println(l);
		}
	}
	
	public void listaDeVideoGames() {
		
		for (VideoGame v : videoGames) {
			
			if (v == null) {
				System.out.println("A loja não tem videogames no seu estoque");
			}
			
			System.out.println(v);
		}
	}
	
	public double calculaPatrimonio() {
		
		double calculaLivro = 0.0;
		double calculaGames = 0.0;
		
		for (Livro l : livros) {
			calculaLivro += l.getPreco() * l.getQuantidade();
		}
		
		for (VideoGame v : videoGames) {
			calculaGames += v.getPreco() * v.getQuantidade();
		}
		
		double somaTotal = calculaLivro + calculaGames;
		
		return somaTotal;
		
	}
	
	

}
