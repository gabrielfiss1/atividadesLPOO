package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ContaController {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1000.10);
        ContaCorrente cc2 = new ContaCorrente(2000.10);
        ContaCorrente cc3 = new ContaCorrente(5000.30);

        ContaPoupanca cp1 = new ContaPoupanca(300.1);
        ContaPoupanca cp2 = new ContaPoupanca(3022.1);
        ContaPoupanca cp3 = new ContaPoupanca(555555.10);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);

        System.out.println(contas.toString());


    }
}
