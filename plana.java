import java.lang.Math;
public class plana extends calculadora{

    double a;
    double b;
    double c;
    double r;
    double h;
    double l;
    double bm;
    double D;
    double d;

    public void quadrado(){
        double perimetroquadrado = this.a * Math.sqrt(4);
        double areaquadrado = (int) Math.pow(this.a, 2);
    }
    public void retangulo(){
        double arearetangulo = a * b;
        double perimetroretangulo = 2 * a * 2 * b;
    }
    public void triangulo(){
        double areatriangulo = a * h / 2;
        double perimetrotriangulo = a + b + c;
    }
    public void trianguloequilatero(){
        double areatrianguloequi = a * h / 2;
        double perimetrotrianguloequi = (int) Math.pow(l, 2) * Math.sqrt(3) / 4;
    }
    public void paralelograma(){
        double areatrianguloequi = a * h;
        double perimetrotrianguloequi = 2 * a * 2 * b;
    }
    public void losango(){
        double arealosango = D * d / 2;
        double perimetrolosango = this.a * Math.sqrt(4);
    }
    public void trapezio(){
        double areatrapezio = c + b + bm + d;
        double perimetrotrapezio = (b + bm) * h / 2;
    }
    public void circulo(){
        double areacirculo = Math.PI * Math.pow(r, 2);
        double comprimentocirculo = 2 * Math.PI * r;
    }
}
