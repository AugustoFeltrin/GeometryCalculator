import java.lang.Math;
public class especial extends calculadora{

    double a;
    double b;
    double c;
    double r;
    double h;
    double g;
    double L;
    double l;
    double R;

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
        double areabasecilindro = Math.PI * Math.pow(r, 2);
        double arealateralcilindro = 2* Math.PI *  r * h;
        double volumeCilindro = Math.PI * Math.pow(r, 2) * h;
    }
    public void cone(){
        double arealateralcone = Math.PI * r * g;
        double areabasecone = Math.PI * Math.pow( r,2);
        double volumecone = (Math.PI * Math.pow( r,2) * h)/ 3;
    }
    public void troncopiramide(){
        double SB = Math.pow(L,2);
        double Sb = Math.pow(l,2);
        double volumetroncocone = h/3 * (SB * Math.sqrt(SB*Sb)+Sb);
    }
    public void troncocone(){
        double volumecone = Math.PI * h * (Math.pow( r,2) + R*r* + Math.pow(R,2))/ 3;
    }
    public void piramide(){
        
    }

}