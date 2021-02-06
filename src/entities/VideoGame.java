package entities;

import interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	public VideoGame() {
		super();
		
	}

	public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
		
	}


	@Override
	public double calculaImposto() {
		
		double imposto = 0.0;
		
		if (this.isUsado) {
			imposto = super.getPreco() * 0.25;
			
		}
		
		else {
			imposto = super.getPreco() * 0.45;
		}
		
		return imposto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("\nNome: " + super.getNome() + "\n");
		str.append("Preço: " + super.getPreco() + "\n");
		str.append("Quantidade: " + super.getQuantidade() + "\n");
		str.append("Marca: " + this.marca + "\n");
		str.append("Modelo: " + this.modelo + "\n");
		str.append("É usado: " + this.isUsado + "\n");
		
		if (this.isUsado) {
			str.append("O imposto do video game de nome " + super.getNome()
			+ " " + this.modelo + " usado é R$ " + String.format("%.2f", calculaImposto()));
			
		} else {
			str.append("O imposto do video game " + super.getNome()
			+ " " + this.modelo + " é de R$ " + String.format("%.2f", calculaImposto()));
		}

		
		return str.toString();

	}
	
	

}
