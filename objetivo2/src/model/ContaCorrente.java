package model;

public class ContaCorrente extends Conta { //subclasse // especifica
    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
