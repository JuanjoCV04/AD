import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println ("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println ("Introduce otro numero");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        System.out.println ("El resultado de la suma es "+suma);
    }
}