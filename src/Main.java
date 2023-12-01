import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //Comentario Luis Antón: añadimos dist4 para modificar el ejercicio de Yoel Palazón.
        double dist1, dist2, dist3, dist4, suma; //dist1 en mm,2 en cm y 3 en m

        System.out.print("Introduzca la primera distancia en mm: ");
        dist1 = leer.nextDouble();

        System.out.print("Introduzca la segunda distancia en cm: ");
        dist2 = leer.nextDouble();

        System.out.print("Introduzca la tercera distancia en m: ");
        dist3 = leer.nextDouble();
        //Comentario Luis Antón: añadimos que se muestre por pantalla dist4 en decámetros.
        System.out.print("Introduzca la cuarta distancia en dm: ");
        dist4 = leer.nextDouble();
        /*Comentario Luis Antón: hacemos que dist4 se multiplique por 1000
        para que se muestre en decámetros.
         */
        dist4 = dist4 * 1000;
        dist1 = dist1 / 10;
        dist3 = dist3 * 100;
        //Comentario Luis Antón: añadimos dist4 a la suma.
        suma = dist1 + dist2 + dist3 + dist4;

        System.out.println("El resultado de la distancia es " + suma + " centímetros");
    }
}