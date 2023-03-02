package pkg.controller;

import pkg.model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet","Onix", 2005);
        Carro carro2 = new Carro("Fiat","Fiorino", 1995);
        Carro carro3 = new Carro("Volkswagen","Gol", 2006);
        Carro carro4 = new Carro("Mclaren","Senna", 2020);
        Carro carro5 = new Carro("DMC","Delorean", 1979);
        System.out.println(carro3);

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        System.out.println(carros);

        System.out.println("Lista DECRESCENTE");
        carros.sort(Comparator.comparing(Carro::getAnoFabricacao).reversed());
        System.out.println(carros);

        System.out.println("\n\nCOLECAO MAP");

        Map<String, Carro> carrosMap = new HashMap<>();//não pode repetir dados
        carrosMap.put(carro1.getMarca(), carro1);
        carrosMap.put(carro2.getMarca(), carro2);
        carrosMap.put(carro3.getMarca(), carro3);
        carrosMap.put(carro4.getMarca(), carro4);
        carrosMap.put(carro5.getMarca(), carro5);
        System.out.println(carrosMap);

    }
}
