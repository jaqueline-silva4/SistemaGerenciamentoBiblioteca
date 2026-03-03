package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private String endereco;
	private ArrayList<Livro> livros = new ArrayList<>();
	
	public Biblioteca(String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.livros = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido!");
		}
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		if(endereco != null && !endereco.isEmpty()) {
			this.endereco = endereco;
		} else {
			System.out.println("Endereço inválido!");
		}
	}

	public ArrayList<Livro> getLivros() {
		return this.livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		if(livros != null) {
			this.livros = livros;
		} else {
			System.out.println("Livro inválido!");
		}
	}
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
		System.out.println("Livro " + livro.getTitulo() + " adicionado com sucesso a " + nome + ".");
		System.out.println();
	}
	
	public void listarLivros() {
		if(livros.isEmpty()) {
			System.out.println("A biblioteca não possui livros cadastrados.");
		} else {
			System.out.println("\n");
			System.out.println("Livros disponíveis na biblioteca " + nome + ":");
			for(Livro livro: livros) {
				System.out.println(" -" + livro.getTitulo());
			}
		}
	}
	
	public Livro buscarLivroPorTitulo(String titulo){
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Livro encontrado: " + livro.getTitulo());
				return livro;
			}
		}
		System.out.println("Livro: " + titulo + " não encontrado na biblioteca.");
		return null;
		
	}

}
