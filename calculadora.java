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