package model;

public abstract class Conta { //super classe //generica
    protected double saldo;

    public void deposita(double valor){
        System.out.println("depositou");
    }

    public double getSaldo() {
        return saldo;
    }
}
