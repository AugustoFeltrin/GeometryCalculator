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
                    System.out.println("Selecione a forma geométrica que deseja calcular:");
                    System.out.println("1. Cubo");
                    System.out.println("2. Prisma");
                    System.out.println("3. Cilindro");
                    System.out.println("4. Pirâmide");
                    System.out.println("5. Tronco de Pirâmide");
                    System.out.println("6. Cone");
                    System.out.println("7. Tronco de Cone");
                    System.out.println("8. Esfera");

        
                    int formaEspacial = scanner.nextInt();
                    scanner.nextLine();    

                    espacial formaEspacialCalculadora = new espacial();

                    switch (formaEspacial) {
                        case 1:
                            System.out.println("Digite o comprimento da aresta do cubo:");
                            double arestaCubo = scanner.nextDouble();
                            formaEspacialCalculadora.a = arestaCubo;
                            formaEspacialCalculadora.cubo();
                            break;

                        case 2:
                            System.out.println("Selecione a base do Prisma:");
                            System.out.println("a. Base 3");
                            System.out.println("b. Base 4");
                            System.out.println("c. Base 5");
                
                        char basePrisma = scanner.next().charAt(0);
                        scanner.nextLine();
                
                        switch (basePrisma) {
                            case 'a':
                                System.out.println("Digite o lado da base do prisma (Base 3):");
                                double ladoBasePrisma3 = scanner.nextDouble();
                                System.out.println("Digite a altura do prisma:");
                                double alturaPrisma3 = scanner.nextDouble();
                                formaEspacialCalculadora.a = ladoBasePrisma3;
                                formaEspacialCalculadora.b = alturaPrisma3;
                                formaEspacialCalculadora.prismabase3();
                                break;

                            case 'b':
                                System.out.println("Digite o comprimento:");
                                double comprimentoPrisma4 = scanner.nextDouble();
                                System.out.println("Digite a largura:");
                                double larguraPrisma4 = scanner.nextDouble();
                                System.out.println("Digite a altura:");
                                double alturaPrisma4 = scanner.nextDouble();
                                formaEspacialCalculadora.a = comprimentoPrisma4;
                                formaEspacialCalculadora.b = larguraPrisma4;
                                formaEspacialCalculadora.c = alturaPrisma4;
                                formaEspacialCalculadora.prismabase4();
                                break;

                            case 'c':
                                System.out.println("Digite o lado da base:");
                                double ladoBasePrisma5 = scanner.nextDouble();
                                System.out.println("Digite a altura:");
                                double alturaPrisma5 = scanner.nextDouble();
                                System.out.println("Digite a altura das faces laterais:");
                                double alturaFacesPrisma5 = scanner.nextDouble();
                                formaEspacialCalculadora.a = ladoBasePrisma5;
                                formaEspacialCalculadora.b = alturaPrisma5;
                                formaEspacialCalculadora.h = alturaFacesPrisma5;
                                formaEspacialCalculadora.prismabase5();
                                break;
                            
                                default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        break;    

                        case 3:
                            System.out.println("Digite o raio da base do cilindro:");
                            double raioCilindro = scanner.nextDouble();
                            System.out.println("Digite a altura do cilindro:");
                            double alturaCilindro = scanner.nextDouble();
                            formaEspacialCalculadora.r = raioCilindro;
                            formaEspacialCalculadora.h = alturaCilindro;
                            formaEspacialCalculadora.cilindro();
                            break;

                        case 4:
                            System.out.println("Selecione o tipo de pirâmide:");
                            System.out.println("a. Pirâmide com base triangular");
                            System.out.println("b. Pirâmide com base quadrada");
                            System.out.println("c. Pirâmide com base pentagonal");
                        
                            char tipoPiramide = scanner.next().charAt(0);
                            scanner.nextLine();
                        
                            switch (tipoPiramide) {
                                case 'a':
                                    System.out.println("Digite a altura da pirâmide com base triangular:");
                                    double alturaPiramideTriangular = scanner.nextDouble();
                                    System.out.println("Digite o comprimento do lado da base da pirâmide com base triangular:");
                                    double ladoBaseTriangular = scanner.nextDouble();
                                    formaEspacialCalculadora.h = alturaPiramideTriangular;
                                    formaEspacialCalculadora.a = ladoBaseTriangular;
                                    formaEspacialCalculadora.piramidebase3();
                                    break;
                                case 'b':
                                    System.out.println("Digite a altura da pirâmide com base quadrada:");
                                    double alturaPiramideQuadrada = scanner.nextDouble();
                                    System.out.println("Digite o comprimento do lado da base da pirâmide com base quadrada:");
                                    double ladoBaseQuadrada = scanner.nextDouble();
                                    formaEspacialCalculadora.h = alturaPiramideQuadrada;
                                    formaEspacialCalculadora.l = ladoBaseQuadrada;
                                    formaEspacialCalculadora.piramidebase4();
                                    break;
                                case 'c':
                                    System.out.println("Digite a altura da pirâmide com base pentagonal:");
                                    double alturaPiramidePentagonal = scanner.nextDouble();
                                    System.out.println("Digite o comprimento do lado da base da pirâmide com base pentagonal:");
                                    double ladoBasePentagonal = scanner.nextDouble();
                                    formaEspacialCalculadora.h = alturaPiramidePentagonal;
                                    formaEspacialCalculadora.l = ladoBasePentagonal;
                                    formaEspacialCalculadora.piramidebase5();
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                            break;

                            case 5:
                                System.out.println("Digite a altura do tronco da pirâmide:");
                                double alturaTroncoPiramide = scanner.nextDouble();
                                System.out.println("Digite o comprimento da base maior do tronco da pirâmide:");
                                double baseMaiorTroncoPiramide = scanner.nextDouble();
                                System.out.println("Digite o comprimento da base menor do tronco da pirâmide:");
                                double baseMenorTroncoPiramide = scanner.nextDouble();
                                formaEspacialCalculadora.h = alturaTroncoPiramide;
                                formaEspacialCalculadora.L = baseMaiorTroncoPiramide;
                                formaEspacialCalculadora.l = baseMenorTroncoPiramide;    
                                formaEspacialCalculadora.troncopiramide();
                                break;

                            case 6:
                                System.out.println("Digite a altura do cone:");
                                double alturaCone = scanner.nextDouble();
                                System.out.println("Digite o raio da base do cone:");
                                double raioBaseCone = scanner.nextDouble();
                                formaEspacialCalculadora.h = alturaCone;
                                formaEspacialCalculadora.r = raioBaseCone;
                                formaEspacialCalculadora.cone();
                                break;

                            case 7:
                                 System.out.println("Digite a altura do tronco do cone:");
                                 double alturaTroncoCone = scanner.nextDouble();
                                 System.out.println("Digite o raio da base maior do tronco do cone:");
                                 double raioBaseMaiorTroncoCone = scanner.nextDouble();
                                 System.out.println("Digite o raio da base menor do tronco do cone:");
                                 double raioBaseMenorTroncoCone = scanner.nextDouble();
                                 formaEspacialCalculadora.h = alturaTroncoCone;
                                 formaEspacialCalculadora.R = raioBaseMaiorTroncoCone;
                                 formaEspacialCalculadora.r = raioBaseMenorTroncoCone;
                                 formaEspacialCalculadora.troncocone();
                                 break;
                            
                            case 8:
                                 System.out.println("Esfera selecionada.");
                                 System.out.println("Digite o raio da esfera:");
                                 double raioEsfera = scanner.nextDouble();
                                 formaEspacialCalculadora.r = raioEsfera;
                                 formaEspacialCalculadora.esfera();
                                 break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                    break;

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