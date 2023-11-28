import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double dist1, dist2, dist3, suma; //dist1 en mm,2 en cm y 3 en m

        System.out.print("Introduzca la primera distancia en mm: ");
        dist1 = leer.nextDouble();

        System.out.print("Introduzca la segunda distancia en cm: ");
        dist2 = leer.nextDouble();

        System.out.print("Introduzca la tercera distancia en m: ");
        dist3 = leer.nextDouble();

        dist1 = dist1 / 10;
        dist3 = dist3 * 100;
        suma = dist1 + dist2 + dist3;

        System.out.println("El resultado de la distancia es " + suma + " centímetros");
    }
}