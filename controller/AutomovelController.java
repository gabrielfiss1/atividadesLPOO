package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
    Automovel automovel1 = new Automovel(1,"42443232","GAI0XB3","Verde", 4, "200 Litros", 30000, "Tesla X", 1200.40);
    Automovel automovel2 = new Automovel(2,"42441111","IAU4XB3","Preto", 4, "100 Litros", 10000, "Tesla S", 900.40);
    Automovel automovel3 = new Automovel(3,"19448771","IAU4V32","Branco", 4, "50 Litros", 100000, "Carbon Black", 8800.48);
    Automovel automovel4 = new Automovel(4,"42442211","OPI0XB3","Vermelho", 6, "500 Litros", 200000, "Scania", 13000.40);
    Automovel automovel5 = new Automovel();

        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(automovel1);
        automovelList.add(automovel2);
        automovelList.add(automovel3);
        automovelList.add(automovel4);
        automovelList.add(automovel5);

        Collections.shuffle(automovelList);
        System.out.println(automovelList);

        Collections.sort(automovelList, Comparator.comparing(Automovel::getId).reversed());
        System.out.println("LISTA ORDENADA-------------");
        System.out.println(automovelList);

        System.out.println("\n");
        Map<Integer, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(automovel1.getId(), automovel1);
        automovelMap.put(automovel2.getId(), automovel2);
        automovelMap.put(automovel3.getId(), automovel3);
        automovelMap.put(automovel4.getId(), automovel4);
        automovelMap.put(automovel5.getId(), automovel5);



        System.out.println(automovelMap);
    }
}
