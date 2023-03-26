package model;

public abstract class Conta { //super classe //generica
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double valor) {
        return this.saldo += valor;
    }

    public void saca(double valor) {
        double saldoAtual = this.saldo - valor;
        if (saldoAtual > 0) { //REGRAS DE NEGOCIO
            this.saldo -= valor;
        } else {
            System.out.println("Não foi possivel realizar a operação");
        }

    }

    public void atualiza(double taxa) {
        if (taxa > 0) {
            this.saldo += this.saldo * (taxa / 100);
        } else {
            System.out.println("A taxa deve ser maior que 0!!");
        }

    }

}
