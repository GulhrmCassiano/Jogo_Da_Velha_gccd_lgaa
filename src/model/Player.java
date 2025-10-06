package model;

public abstract class Player {

    private final String nome;
    private final Symbol symbol;

    public Player(String nome, Symbol symbol) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do jogador não pode ser vazio.");
        }
        if (symbol == null) {
            throw new NullPointerException("Symbol não pode ser nulo.");
        }
        this.nome = nome.trim();
        this.symbol = symbol;
    }

    public String getNome() {
        return nome;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    /** Ação do jogador de escolher a jogadar. */
    public abstract Move escolherJogada(Board board);

    @Override
    public String toString() {
        return "Player{" + "nome='" + nome + '\'' + ", symbol=" + symbol + '}';
    }

}