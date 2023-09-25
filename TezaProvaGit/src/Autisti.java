
public class Autisti {

	public Autisti(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Autisti [nome=" + nome + ", cognome=" + cognome + "]";
	}
	private String nome;
	private String cognome;
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
	
	
}
