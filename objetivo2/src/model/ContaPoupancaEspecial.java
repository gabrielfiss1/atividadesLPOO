package model;

public class ContaPoupancaEspecial extends ContaPoupanca {
    @Override
    public String toString() {
        return "\nContaPoupancaEspecial{" +
                "saldo=" + saldo +
                '}';
    }

    //@Override
   // public double deposita(double valor) {
       // if (valor >= 500.00)
     //       return super.deposita(valor);
   // }
}
