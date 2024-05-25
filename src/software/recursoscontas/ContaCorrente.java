package software.recursoscontas;

import software.clientes.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "\n=== Conta Corrente ===";
    }

}
