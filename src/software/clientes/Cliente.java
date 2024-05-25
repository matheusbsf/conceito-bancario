package software.clientes;

public class Cliente {

    private static int identificacao = 1;

    private int id;
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.id = identificacao++;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente " + id + "\n  Nome: " + nome + "\n  Endereco: " + endereco;
    }

}
