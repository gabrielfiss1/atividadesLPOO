package model;

public class Aviao extends Personagem {

    private double z=0;

    public Aviao(double z) {
        this.z = z;
    }
    public Aviao(double x, double y) {
        super(x, y);

    }
    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Aviao() {
    }

    public void desenhar() {
        System.out.println("Desenhou um aviao");
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\n Aviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
