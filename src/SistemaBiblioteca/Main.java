package SistemaBiblioteca;

public class Main {

	public static void main(String[] args) {
		// criando autores
		
		Autor autor1 = new Autor("George R.R Martin", "Americano");
		Autor autor2 = new Autor("Machado de Assis", "Brasileiro");
		Autor autor3 = new Autor("José de Alencar", "Brasileiro");
		
		// criando livros
		
		Livro livro1 = new Livro("Game of thrones", "8544102921", 2015, "Fantasia", autor1);
		Livro livro2 = new Livro("Dom Casmurro", "8582850352", 1899, "Romance", autor2);
		Livro livro3 = new Livro("Fogo e Sangue", "8556510760", 2018, "Fantasia", autor1);
		Livro livro4 = new Livro("Memórias póstumas de Brás Cubas", "8502082191", 1881, "Teoria e Crítica Literária", autor2);
		Livro livro5 = new Livro("Iracema", "9789895369447", 1865, "Romance", autor3);
		
		// adicionando livros aos autores
		
		livro1.adicionarAutor(autor1, "Autor principal");
		livro2.adicionarAutor(autor2, "Autor principal");
		livro3.adicionarAutor(autor1, "Autor principal");
		livro4.adicionarAutor(autor2, "Autor principal");
		livro5.adicionarAutor(autor3, "Autor principal");
		livro5.adicionarAutor(autor2, "Crítico Literário");
		
		
		
		// criando leitores
		
		Leitor leitor1 = new Leitor("Jaqueline", 1, "jaqueline@email.com");
		Leitor leitor2 = new Leitor("Gabriel", 2, "gabriel@email.com");
		
		// criando biblioteca 
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca Municipal", "Rua das Flores");
		
		// adicionando livros a biblioteca
		
		biblioteca1.adicionarLivro(livro1);
		biblioteca1.adicionarLivro(livro2);
		biblioteca1.adicionarLivro(livro3);
		biblioteca1.adicionarLivro(livro4);
		biblioteca1.adicionarLivro(livro5);
		
		// emprestimos
		
		leitor1.adicionarLivro(livro1);
		leitor2.adicionarLivro(livro2);
		
		// livro emprestado para leitores
		
		livro1.emprestar(leitor1);
		livro2.emprestar(leitor2);
		
		// tentando pegar um livro já emprestado
		
		livro2.emprestar(leitor1);
		
		// devolver livros
		
		livro1.devolver();
		
		// tentando devolver um livro que não está emprestado
		
		livro1.devolver();
		
		// listando os livros da biblioteca
		
		biblioteca1.listarLivros();
		
		// exibindo informações do leitor
		
		leitor1.exibirInformacoes();
		leitor2.exibirInformacoes();
		
		// listando livros dos autores
		
		autor1.listarLivros();
		autor2.listarLivros();
		autor3.listarLivros();
		
		// buscando livro pelo título
		
		biblioteca1.buscarLivroPorTitulo("Memórias póstumas de Brás Cubas");
		biblioteca1.buscarLivroPorTitulo("Como eu era antes de você");
		

	}

}
