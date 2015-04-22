package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {
	private LocalDateTime arrivoIl;
	private String richieste;
	private int numeroNotti;
	private LocalDateTime effettuataIl;
	private LocalDateTime clienteArrivaIl;
	private Cliente cliente;
	
	public Prenotazione(LocalDateTime arrivoIl, String richieste, int numeroNotti, LocalDateTime effettuataIl, LocalDateTime clienteArrivaIl){
		
	}

	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}

	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}

	public String getRichieste() {
		return richieste;
	}

	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}

	public int getNumeroNotti() {
		return numeroNotti;
	}

	public void setNumeroNotti(int numeroNotti) {
		this.numeroNotti = numeroNotti;
	}

	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}

	public void setEffettuataIl(LocalDateTime effettuataIl) {
		this.effettuataIl = effettuataIl;
	}

	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}

	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		this.clienteArrivaIl = clienteArrivaIl;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
