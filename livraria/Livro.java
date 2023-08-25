package livraria;

public class Livro {
    int id;
    String titulo;
    String anoPublicacao;
    String editora;
    int qtspaginas;

    Livro(int id, String titulo, String anoPublicacao, String editora, int qtspaginas){
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.qtspaginas = qtspaginas;
    }

    String detalhar(){
        String detalhe = "";

        detalhe += "\n ID: " + this.id;
        detalhe += "\n Titulo: " + this.titulo;
        detalhe += "\n Ano de publicacao: " + this.anoPublicacao;
        detalhe += "\n Editora: " + this.editora;
        detalhe += "\n Quantidade de paginas: " + this.qtspaginas;

        return detalhe;
    }
    
}
