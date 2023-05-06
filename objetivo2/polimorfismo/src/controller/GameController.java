package controller;

import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        //1 sobrecarga de construtores
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao(1,1,2);
        Navio navio1 = new Navio();
        Navio navio2 = new Navio(3,4);
        Tanque tanque1 =new Tanque();
        Tanque tanque2 = new Tanque(5,5);
        //2 forma
        List<Personagem> personagens_list = new ArrayList<>();
        personagens_list.add(aviao1);
        personagens_list.add(aviao2);
        personagens_list.add(navio1);
        personagens_list.add(navio2);
        personagens_list.add(tanque1);
        personagens_list.add(tanque2);

        System.out.println(personagens_list);

        personagens_list.forEach(p -> {
            p.desenhar(); // agindo polimorfico qual desenhar vai chamar
            if (p instanceof Aviao) {
                ((Aviao) p).mover(7,2,3);
            } else if (p instanceof Navio) {
                p.mover(9,6);
            } else if (p instanceof Tanque) {
                p.mover(10,10);
            }
        });
        System.out.println("Posição atual");
        System.out.println(personagens_list);
    }
}
