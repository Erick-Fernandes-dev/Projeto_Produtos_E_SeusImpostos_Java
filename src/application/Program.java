package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Livro;
import entities.Loja;
import entities.VideoGame;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Livro> livros = new ArrayList<>();
		List<VideoGame> videoGames = new ArrayList<>();
		
		livros.add(new Livro("Mobidick", 100.0, 2, "Melville", "Aventura", 200));
		
		livros.add(new Livro("João e Maria", 80.00, 3, "Irmão Crimm", "Educativo", 240));
		
		
		
		Loja loja = new Loja("Algnologia", "222-222", livros, null);
		
		System.out.println("=========================");
		System.out.println("|====LISTA DE LIVROS====|");
		System.out.println("=========================");
		loja.listaDeLivros();
		
		
		videoGames.add(new VideoGame("PS5", 4000.00, 2, "Sony", "Pro", false));
		videoGames.add(new VideoGame("Xbox SeriesX", 4100.00, 2, "Microsoft", "Pro", true));
		
		loja = new Loja("Algnologia", "222-222", null, videoGames);
		
		System.out.println("\n=============================");
		System.out.println("|====LISTA DE VIDEOGAMES====|");
		System.out.println("=============================");
		loja.listaDeVideoGames();
		
		
		loja = new Loja("Algnologia", "333-44-555", livros, videoGames);
		
		System.out.println("\n<====>PATRIMONIO<====>\n");
		
		System.out.println("Valor total dos produtos: " + String.format("%.2f",loja.calculaPatrimonio()));
		
		loja.salvarDados();
		
	}

}
