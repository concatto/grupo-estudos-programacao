package br.univali.concatto.banco;

public class Banco {
	private ContaCorrente[] contas;
    private static int proximoNumero = 1;
    private int CONTADOR = 0;

	public Banco(){
        contas = new ContaCorrente[100];
	}

	public int criarConta(boolean especial, double saldoInicial, double limite){
        int numero = proximoNumero++;
        ContaCorrente conta = new ContaCorrente(especial, limite, numero, saldoInicial);
        contas[CONTADOR++] = conta;
        return numero;
	}
        
	public int criarConta(double saldoInicial){
        return criarConta(false, saldoInicial, 0);
	}

	public boolean depositar(int conta, double valor){
        ContaCorrente contaCorrente = localizarConta(conta);
        if (contaCorrente != null){
            contaCorrente.depositar(valor);
            return true;
        } else {
            return false;
        }
	}

	public boolean excluirConta(int conta){
        if (contas[conta] != null) {
        	contas[conta] = null;
        	return true;
        }
        return false;
	}

	private ContaCorrente localizarConta(int conta){
        for (ContaCorrente contaCorrente : contas){
            if (contaCorrente != null && contaCorrente.getNumero() == conta){
                return contaCorrente;
            }
        }
        return null;
	}
	
	public boolean sacar(int conta, double valor){
        ContaCorrente contaCorrente = localizarConta(conta);
        if (contaCorrente != null){
            contaCorrente.sacar(valor);
            return true;
        } else {
            return false;
        }
	}

	public boolean transferir(int contaOrigem, int contaDestino, double valor){
        if (sacar(contaOrigem, valor)){
            depositar(contaDestino, valor);
            return true;
        } else {
            return false;
        }
	}
        
    public Movimentacao[] extrato(int conta){
        ContaCorrente contaCorrente = localizarConta(conta);
        if (contaCorrente != null){
            return contaCorrente.movimentacoes();
        } else {
            return null;
        }
    }

    public double saldo(int conta) {
    	ContaCorrente contaCorrente = localizarConta(conta);
        if (contaCorrente != null){
            return contaCorrente.getSaldo();
        } else {
            return -1;
        }
    }
}