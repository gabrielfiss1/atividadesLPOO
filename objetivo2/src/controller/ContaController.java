package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaPoupancaEspecial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupancaEspecial cpe1 = new ContaPoupancaEspecial();
        cc1.deposita(100000.10);
        System.out.println(cc1);
        System.out.println(cp1);
        cpe1.deposita(500.00);
        System.out.println(cpe1);

        cc1.saca(300.00);
        System.out.println(cc1);

        List<Conta> contaList = new ArrayList<>();
        contaList.add(cc1);
        contaList.add(cp1);
        contaList.add(cpe1);

        //saldo total sistema
        System.out.println(
                contaList.stream().mapToDouble(Conta::getSaldo).sum()
        );

    }
}
