//Héctor Ramírez Gómez
//Escribe el suguiente codigo que solvente
//Ejercicio 7

package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main2 {

    int numeroR = ThreadLocalRandom.current().nextInt(1, 100);
    int numeroInt = 0;
    int numeroU = 0;

    public void Juego() {
        boolean Exc = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Intenta adivinar el número que he pensado");
        do {
            numeroInt++;
            do {
                Exc = false;
                try {
                    System.out.print("intento " +numeroInt+" : ");
                    String numeroUsuario = br.readLine();
                    numeroU = Integer.parseInt(numeroUsuario);
                    if (numeroR > numeroU) {
                        System.out.println("El número que he pensado es mayor");
                    }
                    if (numeroR < numeroU) {
                        System.out.println("El número que he pensado es menor");
                    }
                } catch (Exception e) {
                    System.out.println("Unicamente numeros enteros, vuelve a intentarlo \n");
                    Exc = true;
                }
            } while (Exc == true);

        } while (numeroInt != 5 && numeroR != numeroU);

    }

    public void Resultado() {
        if (numeroR == numeroU) {
            System.out.println("\n¡ GANASTE !");
            System.out.println("El número que pensé fue: " + numeroR);
            numeroInt--;
        }
        if (numeroInt == 5) {
            System.out.println("\nPERDISTE, EXEDISTE EL LIMITE DE INTENTOS");
            System.out.println("El número que pensé fue: " + numeroR);
        }
    }

    public static void main(String[] args) {
        Main2 fc = new Main2();
        fc.Juego();
        fc.Resultado();
    }
}
