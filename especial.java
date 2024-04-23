import java.lang.Math;
public class especial extends calculadora{

    double a;
    double b;
    double c;

    public void cubo(){
        double volumecubo = (int) Math.pow(this.a, 3);
        double areacubo = (int) Math.pow(this.a, 2);
        double diametrocubo = this.a * Math.sqrt(3);
    }
    public void paralelepipedo(){
        double volumeparal = this.a * this.b * this.c;
        double areaparal = 2*(this.a*this.b + this.a*this.c + this.b*this.c);
        double diametroparal = Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2)+Math.pow(this.c,2));
    }
    public void cilindro(){
        
    }

}