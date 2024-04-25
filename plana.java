import java.lang.Math;
public class plana extends calculadora{

    double a;
    double b;
    double c;
    double r;
    double h;
    double g;
    double L;
    double l;
    double R;

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
    public void troncocone(){
        double volumecone = Math.PI * h * (Math.pow( r,2) + R*r* + Math.pow(R,2))/ 3;
    }
    public void piramide(){
        
    }

}
