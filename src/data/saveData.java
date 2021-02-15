package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class saveData {
	
	public void lerArquivo(String path) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public void gravadorDeDados(List<String> texto, String path) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String t : texto) {
				bw.write(t);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}