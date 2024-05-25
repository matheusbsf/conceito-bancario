package software.recursoscontas;

import software.clientes.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "\n=== Conta Poupança ===";
    }

}
