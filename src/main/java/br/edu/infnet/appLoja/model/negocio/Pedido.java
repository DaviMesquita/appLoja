package br.edu.infnet.appLoja.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Pedido {

	private LocalDateTime data;
	private int volume;
	private Fregues fregues;
	
	public Pedido() {
		this.data = LocalDateTime.now();
		this.volume = 0;
	}
	
	@Override
	public String toString() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%d;%s", 
				this.getData().format(formatter), 
				this.getVolume(), 
				this.fregues.toString()
			);
	}

	public LocalDateTime getData() {
		return data;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public Fregues getCliente() {
		return fregues;
	}
	public void setCliente(Fregues fregues) {
		this.fregues = fregues;
	}
}
