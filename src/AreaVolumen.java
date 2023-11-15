import java.util.Scanner;

public class AreaVolumen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digita el radio del cilindro: ");
        double r = scanner.nextDouble();

        System.out.print("Por favor digita la altura del cilindro: ");
        double h = scanner.nextDouble();

        //La formula para el area es 2π r h + 2π r² y para el volumen es π r² h
        double area = 2 * 3.14159 * r * h + 2 * 3.14159 * r * r;

        double volumen = 3.14159 * r * r * h;


        System.out.printf("Área del cilindro: " + area);

        System.out.printf("\nVolumen del cilindro: " + volumen);


        scanner.close();

    }

}

