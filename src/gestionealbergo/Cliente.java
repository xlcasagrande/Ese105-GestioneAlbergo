package gestionealbergo;

import java.util.Vector;

public class Cliente {
	private String nome;
	
	private String cognome;
	private String email;
	private String cellulare;
	private Vector<Prenotazione> prenotazioni;
	
	public Cliente(String nome, String cognome, String email, String cellulare){
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Vector<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

}
