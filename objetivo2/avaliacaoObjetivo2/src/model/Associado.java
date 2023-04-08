package model;

public interface Associado {
  Double lucros(Integer qdeContas, Double valorCota);
  Double getLucros();


  Integer qntCotas(Integer qdeContas);

  Integer getCotas();
}
