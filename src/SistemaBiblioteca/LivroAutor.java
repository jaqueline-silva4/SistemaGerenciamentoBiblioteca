package SistemaBiblioteca;

public class LivroAutor {
	
	private Livro livro;
	private Autor autor;
	private String autoria;
	
	public LivroAutor(Livro livro, Autor autor, String autoria) {
		
		this.livro = livro;
		this.autor = autor;
		this.autoria = autoria;
	}

	public Livro getLivro() {
		return this.livro;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public String getAutoria() {
		return this.autoria;
	}

	public void setAutoria(String autoria) {
		if(autoria != null && !autoria.isEmpty()) {
			this.autoria = autoria;
		} else {
			System.out.println("Autoria inválida!");
		}
	}
	
	public void exibirInformações() {
		System.out.println("Livro: " + livro.getTitulo() + 
				"Autor: " + autor.getNome() +
				"Autoria: " + autoria );
	}
	
	
	
	
	
	
	

}
