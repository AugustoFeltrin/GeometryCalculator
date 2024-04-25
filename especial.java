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
    double k;
    double n;
    double m;

    public void cubo(){
        double V = Math.pow(this.a, 3);
        double At = 6 * Math.pow(this.a, 2);
        double Al = 4 *  Math.pow(this.a, 2);
    }
    public void prismabase4(){
        double V = this.a * this.b * this.c;
        double At = 2*(this.a*this.b + this.a*this.c + this.b*this.c);
        double Al = (this.a*this.b)*4;
    }
    public void cilindro(){
        double Ab = Math.PI * Math.pow(this.r, 2);
        double Al = 2* Math.PI *  this.r * this.h;
        double Vc = Math.PI * Math.pow(this.r, 2) * this.h;
    }
    public void cone(){
        double Al = Math.PI * this.r * this.g;
        double Ab = Math.PI * Math.pow( this.r,2);
        double V = (Ab * this.h)/ 3;
    }
    public void troncopiramide(){
        double SB = Math.pow(this.L,2);
        double Sb = Math.pow(this.l,2);
        double V = this.h/3 * (SB * Math.sqrt(SB*Sb)+Sb);
    }
    public void troncocone(){
        double V = Math.PI * this.h * (Math.pow( this.r,2) + this.R*this.r* + Math.pow(this.R,2))/ 3;
    }
    public void piramidebase4(){
        double Al = this.k * (this.m * this.n)/2;
        double Ab = this.l * this.l;
        double At = 2* Al + 2*Ab;
        double V = (this.l*this.l*this.h)/3;
    }
    public void piramidebase3(){
        double Al = this.k * (this.m * this.n)/2;
        double Ab = (this.a * this.h )/ 2;
        double At = Al + Ab;
        double V = (Ab*h)/3;
    }
    public void piramidebase5(){
        double Al = this.k * (this.m * this.n)/2;
        double Ab = ((5*this.l)*this.a)/2;
        double At = Ab + Al;
        double V = (Ab*h)/3;
    }
    public void prismabase3(){
        double Al = (this.h * this.b)*3;
        double Ab = (this.b * this.a)/2;
        double At = (Al + Ab);
        double V = Ab * this.h;
    }
    public void prismabase5(){
        double Al = (this.h * this.b) * 5;
        double Ab = ((5*this.l)*this.a)/2;
        double At = (Al + Ab);
        double V = Ab * this.h;
    }
}