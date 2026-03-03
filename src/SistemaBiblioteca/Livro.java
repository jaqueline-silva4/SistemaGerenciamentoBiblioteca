package SistemaBiblioteca;

import java.util.ArrayList;

public class Livro {
	
	private String titulo;
	private String isbn;
	private int anoPublicacao;
	private String categoria;
	private boolean disponivel;
	private ArrayList<LivroAutor> contribuicoes;
	private Leitor leitorAtual;
	
	public Livro(String titulo, String isbn, int anoPublicacao, String categoria, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.disponivel = true;
		this.contribuicoes = new ArrayList<>();
		this.leitorAtual = null;
		
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		} else {
			System.out.println("Título inválido!");
		}
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		if(isbn != null && !isbn.isEmpty()) {
			this.isbn = isbn;
		} else {
			System.out.println("ISBN inválido!");
		}
	}

	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		if(anoPublicacao > 0) {
			this.anoPublicacao = anoPublicacao;
		} else {
			System.out.println("Ano de publicação inválido!");
		}
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		if(categoria != null && !categoria.isEmpty()) {
			this.categoria = categoria;
		} else {
			System.out.println("Categoria inválido!");
		}
	}

	public boolean isDisponivel() {
		return this.disponivel;
	}

	public ArrayList<LivroAutor> getContribuicoes() {
		return this.contribuicoes;
	}

	public void setContribuicoes(ArrayList<LivroAutor> contribuicoes) {
		if(contribuicoes != null && !contribuicoes.isEmpty()) {
			this.contribuicoes = contribuicoes;
		} else {
			System.out.println("Contribuição inválida!");
		}
	}

	public Leitor getLeitorAtual() {
		return this.leitorAtual;
	}
	
	public void adicionarAutor(Autor autor, String autoria) {
		LivroAutor relacao = new LivroAutor(this, autor, autoria);
		contribuicoes.add(relacao);
		autor.adicionarContribuicao(relacao);
		
	}
	
	public void emprestar(Leitor leitor) {
	    if(!this.disponivel) {
	    	System.out.println("O livro " + getTitulo() + " já está emprestado para " + leitorAtual.getNome());
	    } else {
	    	this.leitorAtual = leitor;
	    	this.disponivel = false;
	    	leitor.adicionarLivro(this);
	    	System.out.println("O livro " + getTitulo() + " foi emprestado para " + leitor.getNome());
	    }
	}

	
	public void devolver() {
		if(!this.disponivel && leitorAtual != null) {
			System.out.println("O livro " + getTitulo() + " foi devolvido por " + leitorAtual.getNome() + ".");
			leitorAtual.devolverLivro(this);
			leitorAtual = null;
			this.disponivel = true;
		} else {
			System.out.println("O livro " + getTitulo() + " não está emprestado.");
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Título: " + titulo);
		System.out.println("ISBN: " + isbn);
		System.out.println("Ano de publicação: " + anoPublicacao);
		System.out.println("Categoria: " + categoria);
		System.out.println("Disponível: " + (disponivel ? "SIM" : "NÃO"));
		
	
		if(leitorAtual != null) {
			System.out.println("Emprestado para: " + leitorAtual.getNome());
		}
		System.out.println("---------------------------------");
	}

}
