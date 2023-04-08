package model;

public abstract class Conta {
    protected Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposita(Double valor){
        this.saldo += valor;
    }

    public void saca(Double valor){
        this.saldo -= valor;
    }
    public void atualiza(Double taxa){
        this.saldo = taxa/100 * saldo;
    }
}
