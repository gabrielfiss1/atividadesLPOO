package pkg.controller;

import pkg.model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jennifer", 30000);
        Funcionario funcionario2 = new Funcionario("Gabriel", 30200);
        Funcionario funcionario3 = new Funcionario("Carol", 13000);
        Funcionario funcionario4 = new Funcionario("Josias", 1800);
        Funcionario funcionario5 = new Funcionario("Zacarias", 1280);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        System.out.println(funcionarios);


        //Collections.reverse(funcionarios); //outro jeito de inverter
         //Collections.shuffle(funcionarios); //embaralhar
       funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarios);
        System.out.println("\n\n MAP");

        Map<Double, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put(funcionario1.getSalario(), funcionario1);
        funcionariosMap.put(funcionario2.getSalario(), funcionario2);
        System.out.println(funcionariosMap);

        System.out.println("\n pesquisa no Map");
        System.out.println(funcionariosMap.get(funcionario1.getSalario()));//vantagem de pesquisa rapida 


    }

}
