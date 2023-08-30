package Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }
}

class gerenciamento {
    private ArrayList<ItemEstoque> estoque = new ArrayList<>();

    public void adicionarItem(String nome, int quantidade) {
        estoque.add(new ItemEstoque(nome, quantidade));
        System.out.println("Item adicionado");
    }

    public void removerItem(String nome) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(item);
                System.out.println("Item removido");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }

    public void listarItens() {
        System.out.println("Estoque:");
        for (ItemEstoque item : estoque) {
            System.out.println(item.getNome() + " Quantidade: " + item.getQuantidade());
        }
    }

    public void atualizarQtd(String nome, int novaQuantidade) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }
}

public class Estoque {
    public static void main(String[] args) {
        gerenciamento sistema = new gerenciamento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n -------Sistema de Gerenciamento de Estoque-------");
            System.out.println("\n 1- Adicionar item");
            System.out.println("\n 2- Remover item");
            System.out.println("\n 3- Listar itens");
            System.out.println("\n 4- Atualizar quantidade");
            System.out.println("\n 0- Sair");
            System.out.println("\n Digite a opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("\n Quantidade: ");
                    int quantidade = scanner.nextInt();
                    sistema.adicionarItem(nome, quantidade);
                    break;

                case 2:
                    System.out.print("\n Nome do item: ");
                    nome = scanner.nextLine();
                    sistema.removerItem(nome);
                    break;

                case 3:
                    sistema.listarItens();
                    break;

                case 4:
                    System.out.print("\n Nome do item: ");
                    nome = scanner.nextLine();
                    System.out.print("\n Nova quantidade: ");
                    quantidade = scanner.nextInt();
                    sistema.atualizarQtd(nome, quantidade);
                    break;

                case 0:
                    System.out.println("\n Saindo");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\n Opção inválida");
            }
        }
    }
}