package software;

import software.clientes.Cliente;
import software.recursoscontas.*;

public class Software {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Junior", "Av Brasil, Nº 50");
        Cliente cliente2 = new Cliente("Maria", "Rua Getúlio Vargas, Nº 123");

        Conta conCorrente = new ContaCorrente(cliente1);
        Conta conPoupanca = new ContaPoupanca(cliente2);

        conCorrente.depositar(240.50);

        conCorrente.extratoConta();

        conCorrente.transferir(125.25, conPoupanca);

        conPoupanca.extratoConta();

        conPoupanca.sacar(50.60);

        conPoupanca.transferir(25, conPoupanca);

        conPoupanca.transferir(500, conCorrente);

    }
}
