package software.recursoscontas;

import software.clientes.Cliente;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 001;
    private static int sequencialConta = 1000;

    protected int conta;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo = 0;

    public Conta(Cliente cliente) {
        this.conta = sequencialConta++;
        this.agencia = AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("\nSaldo insuficiente.");
            return;
        }

        this.saldo -= valor;
        System.out.println("\nSaque de R$" + String.format("%.2f", valor) + " realizado.\nNovo saldo: R$"
                + String.format("%.2f", this.saldo));
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido.");
            return;
        }

        this.saldo += valor;
        System.out.println("\nDepósito de R$" + String.format("%.2f", valor) + " realizado." +
                "\nNovo saldo: R$" + String.format("%.2f", this.saldo));
    }

    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino == this) {
            System.out.println("\nNão é possível realizar uma transferência para a mesma conta.");
            return;
        } else if (valor > this.saldo) {
            System.out.println("\nSaldo insuficiente.");
            return;
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("\nDados do recebedor:");
        consultarInfoConta(contaDestino);
    }

    public void consultarInfoConta(Conta conta) {
        System.out.println("\n  Titular: " + conta.getCliente().getNome() + "\n  Conta: " + conta.getConta()
                + "\n  Agência: " + conta.getAgencia());

    }

    public void extratoConta() {
        System.out.println(this);
        consultarInfoConta(this);
        System.out.println("  Saldo:" + String.format("%.2f", this.saldo));
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
