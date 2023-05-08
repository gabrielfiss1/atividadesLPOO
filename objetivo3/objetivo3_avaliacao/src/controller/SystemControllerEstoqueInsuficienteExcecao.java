package controller;

public class SystemControllerEstoqueInsuficienteExcecao  extends Exception{
    public SystemControllerEstoqueInsuficienteExcecao() {
        super("\nErro, estoque insuficiente.");
    }
}
