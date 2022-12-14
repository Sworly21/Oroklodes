package hu.petrik.sokszogOOP;



public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzergesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }

    public Haromszog(){
        super(veletlenOldalgeneralas());
        this.b = veletlenOldalgeneralas();
        this.c = veletlenOldalgeneralas();
        while (!this.isSzergesztheto()){
            super.setA(veletlenOldalgeneralas());
            this.b = veletlenOldalgeneralas();
            this.c = veletlenOldalgeneralas();
        }
    }

    private static double veletlenOldalgeneralas() {
        return Math.random() * 10 + 5;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzergesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzergesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    @Override
    public double getKerulet(){
        return this.getA() + this.getB() + this.getC();
    }
    private double getS(){
        return  getKerulet()/2;
    }

    private boolean isSzergesztheto(){
        return  this.getA() + this.getB() > this.getC() &&
                this.getA() + this.getC() > this.getB() &&
                this.getB() + this.getC() > this.getA();
    }
    @Override
    public double getTerulet(){
        return Math.sqrt(this.getS()) * (this.getS() - this.getA())
                * (this.getS() - this.getB())
                * (this.getS() - this.getC());
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a= %-10.3f b=%-10.3f  c=%-10.3f %s",
                this.getA(),this.getB(),this.getC(), super.toString());
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzergesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }


}
