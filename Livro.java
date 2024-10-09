package Composição;

public class Livro {
	private String  titulo;
	private Autor autor; 


	//Construtor
	public Livro (String titulo, String autor) {
		this.titulo=titulo;
		this.autor= new Autor(autor);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public Autor getAutor() {
		return autor;
	}
}

