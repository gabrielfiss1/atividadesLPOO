package objetivo1.controller;

import objetivo1.model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno(1,"Gabriel");
        Aluno a4 = new Aluno(2, "Jennifer");
        Aluno a5 = new Aluno(3,999111111, "Carolina", "Silva", "kasilva@gmail.com");
        Aluno a6 = new Aluno(4,999111112, "Dagobertp", "Suarez", "dagol@gmail.com");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        a1.setId(5);
        a1.setCpf(999222333);
        a1.setNome("Rosangela");
        a1.setSobrenome("Rosa");
        a1.setEmail("rorongela@yahoo.com");
        System.out.println(a1.getId());
        System.out.println(a1.getCpf());
        System.out.println(a1.getNome());
        System.out.println(a1.getSobrenome());
        System.out.println(a1.getEmail());

        a2.setId(6);
        a2.setCpf(229222333);
        a2.setNome("Ana");
        a2.setSobrenome("Kraquen");
        a2.setEmail("anaquen@yahoo.com");
        System.out.println(a2.getId());
        System.out.println(a2.getCpf());
        System.out.println(a2.getNome());
        System.out.println(a2.getSobrenome());
        System.out.println(a2.getEmail());

        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(a1);
        alunosList.add(a2);
        alunosList.add(a3);
        alunosList.add(a4);
        alunosList.add(a5);
        alunosList.add(a6);
        alunosList.sort(Comparator.comparing(Aluno::getId)); //ordenando por ordem crescente
        System.out.println(alunosList);

        Aluno alunoFilter = alunosList.stream().filter(Aluno -> Aluno.getId().equals(5)).findAny().orElse(null);
        System.out.println(alunoFilter);

        Map<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(1, a3);
        alunosMap.put(2, a4);
        alunosMap.put(3, a5);
        alunosMap.put(4, a6);
        alunosMap.put(5, a1);
        alunosMap.put(6, a2);
        System.out.println(alunosMap);
    }
}
