package SistemaBiblioteca;

import java.util.ArrayList;

public class Leitor {
	
	private String nome;
	private int id;
	private String email;
	private ArrayList<Livro> livrosEmprestados;
	
	public Leitor(String nome, int id, String email) {
		
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.livrosEmprestados = new ArrayList<>();
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		} else {
			System.out.println("ID inválido!");
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		if(email != null && !email.isEmpty()) {
			this.email = email;
		} else {
			System.out.println("Email inválido!");
		}
	}

	public ArrayList<Livro> getLivrosEmprestados() {
		return this.livrosEmprestados;
	}
	
	public void setLivrosEmprestados(ArrayList<Livro> livros) {
		if(livrosEmprestados != null && !livrosEmprestados.isEmpty()) {
			this.livrosEmprestados = livros;
		} else {
			System.out.println("Contribuição inválida!");
		}
	}

	public void adicionarLivro(Livro livro) {
		if(!livrosEmprestados.contains(livro)) {
			livrosEmprestados.add(livro);
		}
	}
	
	public void devolverLivro(Livro livro) {
		if(livrosEmprestados.contains(livro)) {
			livrosEmprestados.remove(livro);
		}
	}
	
	public void listarLivrosEmprestados() {
		if(livrosEmprestados.isEmpty()) {
			System.out.println(getNome() + " não possui livros emprestados");
		} else {
			System.out.println("Livros emprestados por " + getNome());
			for(Livro livro : livrosEmprestados) {
				System.out.println("- " + livro.getTitulo());
			}
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("-------------------------------------------");
		System.out.println("Leitor: " + getNome());
		System.out.println("ID: " + getId());
		System.out.println("Email: " + getEmail());
		System.out.println("Livros emprestados: " + livrosEmprestados.size());
		System.out.println("\n");
	}
	
	
	
	
	
	

}
