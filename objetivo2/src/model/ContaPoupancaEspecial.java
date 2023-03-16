package model;

public class ContaPoupancaEspecial extends ContaPoupanca {
    @Override
    public String toString() {
        return "ContaPoupancaEspecial{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public void deposita(double valor) {
        if (valor >= 500.00) {
            super.deposita(valor);
        } else{
            System.out.println("Recusado");
        }
    }
}
