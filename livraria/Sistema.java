package livraria;

import java.util.Scanner;

public class Sistema{

    public static void main(String[] args){

        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Livraria livraria = new Livraria();

        while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4- Sair");
            opcao = sc.nextInt();
            executarOpcao(opcao, sc, livraria);
        }
        System.out.println("Sistema encerrado");
        sc.close();
    }

    public static void executarOpcao(int op, Scanner sc, Livraria livraria){
        switch(op){
            case 1:
                System.out.println("Adicionando livro");
                System.out.println("Digite o ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o titulo: ");
                String tit = sc.nextLine();
                System.out.println("Digite o ano de publicacao: ");
                String ano = sc.nextLine();
                System.out.println("Digite a editora: ");
                String ed = sc.nextLine();
                System.out.println("Digite a quantidade de paginas: ");
                int qtdPg = sc.nextInt();

                Livro l = new Livro(id, tit, ano, ed, qtdPg);
                livraria.adicionarLivro(l);

                break;
            case 2:
                System.out.println("Listando livro");
                System.out.println("\n\n");
                System.out.println(livraria.listarLivros());
                System.out.println("\n\n");
                break;
            case 3:
                System.out.println("Detalhar livro");
                System.out.println("Digite o ID: ");
                int idDetalhe = sc.nextInt();
                System.out.println(livraria.detalharlivro(idDetalhe));
                break;
        }
    }
}


