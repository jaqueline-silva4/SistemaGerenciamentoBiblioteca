package SistemaBiblioteca;

import java.util.ArrayList;

public class Autor {
	
	private String nome;
	private String nacionalidade;
	private ArrayList<LivroAutor> contribuicoes;
	
	public Autor(String nome, String nacionalidade) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.contribuicoes = new ArrayList<>();
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

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		if(nacionalidade != null && !nacionalidade.isEmpty()) {
			this.nacionalidade = nacionalidade;
		} else {
			System.out.println("Nacionalidade inválida!");
		}
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
	
	public void adicionarContribuicao(LivroAutor contribuicao) {
        if (contribuicao != null && !contribuicoes.contains(contribuicao)) {
            contribuicoes.add(contribuicao);
        }
    }

	
	public void listarLivros() {
		System.out.println("Livros do autor " + getNome() + ":");
		for(LivroAutor relacao : contribuicoes) {
			System.out.println("- " + relacao.getLivro().getTitulo() + " (" + relacao.getAutoria() + ")");
		}
		System.out.println();
    }
		

	
	

}
