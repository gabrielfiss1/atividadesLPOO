package objetivo1.controller;

import objetivo1.model.Aluno;

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





    }
}
