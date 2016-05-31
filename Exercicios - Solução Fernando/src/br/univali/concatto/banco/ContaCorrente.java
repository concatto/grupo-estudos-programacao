package br.univali.concatto.banco;

public class ContaCorrente {
    private boolean especial;
    private double limite;
    private int numero;
    private double saldo;
    private Movimentacao[] movimentacoes;
    private int CONTADOR = 0;

    public ContaCorrente() {

    }

    public ContaCorrente(boolean especial, double limite, int numero, double saldo) {
        this.especial = especial;
        this.limite = limite;
        this.numero = numero;
        this.saldo = saldo;
        this.movimentacoes = new Movimentacao[100];
    }

    private void criarMovimentacao(String descricao, double valor) {
        Movimentacao movimentacao = new Movimentacao(descricao,valor);
        movimentacoes[CONTADOR++] = movimentacao;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        criarMovimentacao("deposito", valor);
        return true;

    }

    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            criarMovimentacao("saque", valor * -1);
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }
    
    public Movimentacao[] movimentacoes(){
        return movimentacoes;
    }

    public boolean isEspecial() {
		return especial;
	}
    
    public double getSaldo() {
		return saldo;
	}
}
