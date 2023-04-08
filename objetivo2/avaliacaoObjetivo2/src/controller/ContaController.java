package controller;

import model.*;

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

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);

        System.out.println(contas.toString());

        System.out.println();

        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);

        System.out.println(associados.toString());

        cp1.deposita(1000.0);
        System.out.println(cp1);
        cp1.atualiza(5.0);
        System.out.println(cp1);
        cp1.saca(50.0);
        System.out.println(cp1);

    }
}
