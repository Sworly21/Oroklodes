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
    @Override
    public double getKerulet(){
        return 2 * (this.getA()+this.getB());
    }
    @Override
    public double getTerulet(){
        return this.getA()*this.getB();
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a= %-10.3f b=%-10.3f %s",
                this.getA(),this.getB(),super.toString());
    }
}
