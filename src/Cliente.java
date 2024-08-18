import java.util.Objects;

public class Cliente {
    String nome;
    String agencia;
    int id;
    int saldo;

    public Cliente(String nome, String agencia, int id, int saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.id = id;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo, int tipoTransacao) {
        if (tipoTransacao == 1){
            this.saldo += saldo;
        }else {
            this.saldo -= saldo;
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
