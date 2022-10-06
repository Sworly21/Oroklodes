package hu.petrik.sokszogOOP;

public class Teglalap extends  Sokszog{
    private double b;

    public double getB() {
        return b;
    }

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet(){
        return 2 * (this.getA()+this.getB());
    }

    public double getTerulet(){
        return (this.getA()*this.getB());
    }
}
