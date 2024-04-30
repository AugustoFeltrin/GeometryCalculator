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
        System.out.println("Perímetro do quadrado: " + perimetroquadrado);
        System.out.println("Área do quadrado: " + areaquadrado);
    }

    public void retangulo(){
        double arearetangulo = a * b;
        double perimetroretangulo = 2 * a * 2 * b;
        System.out.println("Área do retângulo: " + arearetangulo);
        System.out.println("Perímetro do retângulo: " + perimetroretangulo);
    }

    public void triangulo(){
        double areatriangulo = a * h / 2;
        double perimetrotriangulo = a + b + c;
        System.out.println("Área do triangulo: " + areatriangulo);
        System.out.println("Perímetro do triangulo: " + perimetrotriangulo);
    }

    public void trianguloequilatero(){
        double areatrianguloequi = (Math.sqrt(3) / 4) * Math.pow(l, 2);
        double perimetrotrianguloequi = 3 * l;
        System.out.println("Área do triângulo equilátero: " + areatrianguloequi);
        System.out.println("Perímetro do triângulo equilátero: " + perimetrotrianguloequi);
    }

    public void paralelograma(){
        double areaparalelograma = a * h;
        double perimetroparalelograma = 2 * a * 2 * b;
        System.out.println("Área do paralelograma: " + areaparalelograma);
        System.out.println("Perímetro do paralelograma: " + perimetroparalelograma);
    }

    public void losango(){
        double arealosango = D * d / 2;
        double perimetrolosango = a * 4;
        System.out.println("Área do losango: " + arealosango);
        System.out.println("Perímetro do losango: " + perimetrolosango);
    }

    public void trapezio(){
        double areatrapezio = a + b + bm + c;
        double perimetrotrapezio = (b + bm) * h / 2;
        System.out.println("Área do trapézio: " + areatrapezio);
        System.out.println("Perímetro do trapézio: " + perimetrotrapezio);
    }

    public void circulo(){
        double areacirculo = Math.PI * Math.pow(r, 2);
        double comprimentocirculo = 2 * Math.PI * r;
        System.out.println("Área do círculo: " + areacirculo);
        System.out.println("Comprimento do círculo: " + comprimentocirculo);
    }
}
