package br.univali.concatto.banco;

public class Movimentacao {
    protected String descricao;
    protected char tipo;
    protected double valor;

    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.tipo = (valor < 0) ? 'd' : 'c';
        this.valor = Math.abs(valor);
    }

    @Override
    public String toString() {
        return descricao + " " + tipo + " valor: " + valor + " (" + tipo + ")";
    }

}
