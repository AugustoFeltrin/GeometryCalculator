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
                            double ladoA = scanner.nextDouble();
                            System.out.println("Digite o lado b do triângulo:");
                            double ladoB = scanner.nextDouble();
                            System.out.println("Digite o lado c do triângulo:");
                            double ladoC = scanner.nextDouble();
                            formaPlanaCalculadora.h = alturaTriangulo;
                            formaPlanaCalculadora.a = ladoA;
                            formaPlanaCalculadora.b = ladoB;
                            formaPlanaCalculadora.c = ladoC;

                            formaPlanaCalculadora.triangulo();
                        break;
                        
                        case 4:
                            System.out.println("Digite o lado do triângulo equilátero:");
                            double ladoEquilatero = scanner.nextDouble();
                            formaPlanaCalculadora.l = ladoEquilatero;
                            formaPlanaCalculadora.trianguloequilatero();
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