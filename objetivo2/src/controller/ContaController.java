package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaPoupancaEspecial;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupancaEspecial cpe1 = new ContaPoupancaEspecial();
        cc1.deposita(10.8);
        System.out.println(cc1);
        System.out.println(cp1);
        cpe1.deposita(500.00);
        System.out.println(cpe1);

    }
}
