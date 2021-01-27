package animali;

public abstract class Animale {
	// Ah yes 
	private int numeroZampe;
	private int massa;
	private String nome;
	public int getNumeroZampe() {
		return numeroZampe;
	}
	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}
	public int getMassa() {
		return massa;
	}
	public void setMassa(int massa) {
		this.massa = massa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Animale [numeroZampe=" + numeroZampe + ", massa=" + massa + ", nome=" + nome + "]";
	}
	
	
}
