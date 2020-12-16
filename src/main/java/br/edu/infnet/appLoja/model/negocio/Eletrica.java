package br.edu.infnet.appLoja.model.negocio;

import br.edu.infnet.appLoja.model.exceptions.MetragemInvalidaException;

public class Eletrica extends Material {

	private boolean tipo; //true = Simples| false = Paralelo
	private int metragem;
	
	public Eletrica(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTipo() ? "Simples" : "Paralelo");
		sb.append(";");
		sb.append(this.getMetragem());

		return sb.toString();
	}

	@Override
	public float calcularPrecoVenda() {
		return this.getPreco() * (this.getTipo() ? 1.0f : 2.0f) * this.getMetragem();
	}

	public boolean getTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(int metragem) throws MetragemInvalidaException{
		
		if(metragem <= 0 || metragem > 100) {
			throw new MetragemInvalidaException("A metragem não pode ser abaixo de 1 ou acima de 100");
		}
		this.metragem = metragem;
	}
}
