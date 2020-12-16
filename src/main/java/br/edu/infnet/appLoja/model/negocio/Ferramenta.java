package br.edu.infnet.appLoja.model.negocio;

public class Ferramenta extends Material{

	private boolean cabo; //true = com| false = sem
	private float tamanho;
	
	public Ferramenta(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getCabo() ? "com Cabo" : "sem Cabo");
		sb.append(";");
		sb.append(this.getTamanho());

		return sb.toString();
	}

	@Override
	public float calcularPrecoVenda() {
		return this.getPreco() + (this.getCabo() ? 10.0f : 0) + (this.getTamanho() / 2.0f) ;
	}

	public boolean getCabo() {
		return cabo;
	}
	public void setCabo(boolean cabo) {
		this.cabo = cabo;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
}
