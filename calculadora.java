import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seja bem vindo, selecione o que deseja calcular:");
            System.out.println("1. Geometria Plana");
            System.out.println("2. Geometria Espacial");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("1. Quadrado");
                    System.out.println("2. Retangulo");
                    System.out.println("3. Triangulo");
                    System.out.println("4. Triangulo Equilatero");
                    System.out.println("5. Paralelograma");
                    System.out.println("6. Lozango");
                    System.out.println("7. Trapezio");
                    System.out.println("8. Circulo");

                    int formaPlana = scanner.nextInt();
                    scanner.nextLine();            

                    plana formaPlanaCalculadora = new plana();

                    switch (formaPlana) {
                        case 1:
                            System.out.println("Digite o lado do quadrado:");
                            double ladoQuadrado = scanner.nextDouble();
                            formaPlanaCalculadora.a = ladoQuadrado;
                            formaPlanaCalculadora.quadrado();
                        break;

                        case 2:
                            System.out.println("Digite a base do retângulo:");
                            double baseRetangulo = scanner.nextDouble();
                            System.out.println("Digite a altura do retângulo:");
                            double alturaRetangulo = scanner.nextDouble();
                            formaPlanaCalculadora.a = baseRetangulo;
                            formaPlanaCalculadora.b = alturaRetangulo;
                            formaPlanaCalculadora.retangulo();
                        break;
                       
                        case 3:
                            System.out.println("Digite a altura do triângulo:");
                            double alturaTriangulo = scanner.nextDouble();
                            System.out.println("Digite o lado a do triângulo:");
                            double ladoATriangulo = scanner.nextDouble();
                            System.out.println("Digite o lado b do triângulo:");
                            double ladoBTriangulo = scanner.nextDouble();
                            System.out.println("Digite o lado c do triângulo:");
                            double ladoCTriangulo = scanner.nextDouble();
                            formaPlanaCalculadora.h = alturaTriangulo;
                            formaPlanaCalculadora.a = ladoATriangulo;
                            formaPlanaCalculadora.b = ladoBTriangulo;
                            formaPlanaCalculadora.c = ladoCTriangulo;
                            formaPlanaCalculadora.triangulo();
                        break;
                        
                        case 4:
                            System.out.println("Digite o lado do triângulo equilátero:");
                            double ladoEquilatero = scanner.nextDouble();
                            formaPlanaCalculadora.l = ladoEquilatero;
                            formaPlanaCalculadora.trianguloequilatero();
                        break;
                    
                        case 5:
                            System.out.println("Digite a altura do paralelograma:");
                            double alturaParalelograma = scanner.nextDouble();
                            System.out.println("Digite o primeiro lado  do paralelograma:");
                            double ladoAParalelograma = scanner.nextDouble();
                            System.out.println("Digite o segundo lado do paralelograma:");
                            double ladoBParalelograma = scanner.nextDouble();
                            formaPlanaCalculadora.h = alturaParalelograma;
                            formaPlanaCalculadora.a = ladoAParalelograma;
                            formaPlanaCalculadora.b = ladoBParalelograma;
                            formaPlanaCalculadora.paralelograma();
                        break;

                        case 6:
                            System.out.println("Digite o lado do losango:");
                            double ladoLosango = scanner.nextDouble();
                            System.out.println("Digite o diametro maior do losango:");
                            double DiametroLosango = scanner.nextDouble();
                            System.out.println("Digite o diametro menor do losango:");
                            double diametroLosango = scanner.nextDouble();
                            formaPlanaCalculadora.a = ladoLosango;
                            formaPlanaCalculadora.D = DiametroLosango;
                            formaPlanaCalculadora.d = diametroLosango;
                            formaPlanaCalculadora.losango();
                        break;
                        
                        case 7:
                            System.out.println("Digite o lado do trapezio:");
                            double ladoTrapezio = scanner.nextDouble();
                            System.out.println("Digite o outro lado do trapezio:");
                            double ladoSTrapezio = scanner.nextDouble();
                            System.out.println("Digite a base menor do trapezio:");
                            double baseMenorTrapezio = scanner.nextDouble();
                            System.out.println("Digite a base maior do trapezio:");
                            double baseMaiorTrapezio = scanner.nextDouble();
                            formaPlanaCalculadora.a = ladoTrapezio;
                            formaPlanaCalculadora.c = ladoSTrapezio;
                            formaPlanaCalculadora.b = baseMenorTrapezio;
                            formaPlanaCalculadora.bm = baseMaiorTrapezio;
                            formaPlanaCalculadora.trapezio();
                        break;

                        case 8:
                            System.out.println("Digite o raio da circunferência:");
                            double raioCirculo = scanner.nextDouble();
                            formaPlanaCalculadora.r = raioCirculo;
                            formaPlanaCalculadora.circulo();
                    break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("Selecione a forma geometrica que deseja calcular:"); 
                    System.out.println("1. Prisma");
                    System.out.println("2. Piramide");
                    System.out.println("3. Cilindro");
                    System.out.println("4. Cone");
                    System.out.println("5. Tronco de Cone");
                    System.out.println("6.  Esfera");
        
                    int formaEspacial = scanner.nextInt();
                    scanner.nextLine();    

                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;                  

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}