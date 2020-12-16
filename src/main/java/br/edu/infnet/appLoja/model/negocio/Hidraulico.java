package br.edu.infnet.appLoja.model.negocio;

import br.edu.infnet.appLoja.model.exceptions.MilimetragemInvalidaException;
import br.edu.infnet.appLoja.model.exceptions.TipoInvalidoException;

public class Hidraulico extends Material {

	private String tipo; // Válidos são Agua, Esgoto e Cola
	private float milimetragem;
	
	public Hidraulico(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTipo());
		sb.append(";");
		sb.append(this.getMilimetragem());

		return sb.toString();
	}

	@Override
	public float calcularPrecoVenda() {
		float tipo = 0;
		
		switch(this.getTipo().toUpperCase()) {
		case "AGUA":
			tipo = 3;
			break;
		case "ESGOTO":
			tipo = 1;
			break;
		case "COLA":
			tipo = 2;
			break;
		}
		
		return this.getPreco() + tipo * (this.getMilimetragem() / 10.0f);
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) throws TipoInvalidoException{
		
		switch(tipo.toUpperCase()) {
			case "AGUA":
				break;
			case "ESGOTO":
				break;
			case "COLA":
				break;
			default:
				throw new TipoInvalidoException("Os tipos válidos são: Agua; Cola; Esgoto");
		}
		this.tipo = tipo;
		
	}
	public float getMilimetragem() {
		return milimetragem;
	}
	public void setMilimetragem(float milimetragem) throws MilimetragemInvalidaException {
		
		if(milimetragem <= 20 || milimetragem > 150) {
			throw new MilimetragemInvalidaException("Milimetragem Invalida");
		}
		
		this.milimetragem = milimetragem;
	}
}
