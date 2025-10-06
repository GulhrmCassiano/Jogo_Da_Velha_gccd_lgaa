package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class computerPlayer extends Player {
    private final Random rand = new Random();

    public computerPlayer(String nome, Symbol symbol) {
        super(nome, symbol);
    }

    @Override
    public Move escolherJogada(Board board, ConsoleView view) {
        List<Move> disponiveis = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board.estaVazio(i, j)) {
                    disponiveis.add(new Move(i, j));
                }
        return disponiveis.get(rand.nextInt(disponiveis.size()));
    }
}
 src/view/ConsoleView.java
        java
Copiar código
package view;

import java.util.Scanner;
import model.*;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public void exibirTabuleiro(Board board) {
        System.out.println("\n   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board.getSymbol(i, j).toString() + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---+---+---");
        }
    }

    public Move lerJogada(Player p) {
        int linha = -1, coluna = -1;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(p.getNome() + " (" + p.getSymbol() + "), digite linha e coluna (ex: 0 2): ");
                linha = scanner.nextInt();
                coluna = scanner.nextInt();
                valido = linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2;
                if (!valido) System.out.println("Coordenadas inválidas! Use valores de 0 a 2.");
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite números.");
                scanner.nextLine();
            }
        }
        return new Move(linha, coluna);
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public boolean jogarNovamente() {
        System.out.print("Deseja jogar novamente? (S/N): ");
        return scanner.next().trim().equalsIgnoreCase("S");
    }

    public int mostrarMenu() {
        System.out.println("\nJogo da Velha");
        System.out.println("1) Humano vs Humano");
        System.out.println("2) Humano vs Computador");
        System.out.println("3) Computador vs Computador");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        System.out.print("Digite o nome do jogador: ");
        return scanner.next();
    }

    public void mostrarPlacar(int p1Wins, int p2Wins, int empates) {
        System.out.println("Placar:");
        System.out.println("Jogador 1: " + p1Wins);
        System.out.println("Jogador 2: " + p2Wins);
        System.out.println("Empates : " + empates);
    }
}
📄 src/controller/Game.java
        java
Copiar código
package controller;

import model.*;
        import view.ConsoleView;

public class Game {
    private final Board board;
    private final ConsoleView view;
    private final Player p1, p2;

    public Game(Player p1, Player p2, Board board, ConsoleView view) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = board;
        this.view = view;
    }

    public GameResult jogar() {
        Player




        Continuar gerando
