package controller;

import model.Conta;
import model.ContaCorrente;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(10.8);
        System.out.println(c1);
    }
}
