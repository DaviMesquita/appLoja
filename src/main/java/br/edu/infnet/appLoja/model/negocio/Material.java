package br.edu.infnet.appLoja.model.negocio;

public abstract class Material {
	
	private String nome;
	private float preco;
	private String marca;
	
	public Material(String nome, float preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public abstract float calcularPrecoVenda();
	
	public String obterPrecoPorMaterial() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.calcularPrecoVenda());
		sb.append("\r");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getPreco());
		sb.append(";");
		sb.append(this.getMarca());
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public float getPreco() {
		return preco;
	}
	public String getMarca() {
		return marca;
	}
	
}
