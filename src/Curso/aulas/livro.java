package Curso.aulas;

import java.util.Objects;

public class livro {

     private String nome;
     private String autor;
     private Integer volume;
	
     public livro(String nome, String autor, Integer volume) {
		this.nome = nome;
		this.autor = autor;
		this.volume = volume;
	}

	public livro() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, nome, volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		livro other = (livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome)
				&& Objects.equals(volume, other.volume);
	}

	@Override
	public String toString() {
		return "livro [nome=" + nome + ", autor=" + autor + ", volume=" + volume + "]";
	}

	
	





}
