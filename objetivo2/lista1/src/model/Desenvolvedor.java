package model;

public class Desenvolvedor extends Funcionario {
    @Override
    public void setSalario(Double salario) {
        super.setSalario(3500.00);
    }

    @Override
    public Double getBonus() {
        return getSalario() * 0.4;
    }
}
