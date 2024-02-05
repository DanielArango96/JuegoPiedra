package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcionUsuario;
        Random random = new Random();

        System.out.println("Ingrese piedra, papel o tijera: ");
        Scanner scanner = new Scanner(System.in);
        opcionUsuario = scanner.nextLine();

        if (opcionUsuario.equals("piedra") || opcionUsuario.equals("papel") || opcionUsuario.equals("tijera")) {
            String[] opciones = {"piedra", "papel", "tijera"};
            int opcionInt = random.nextInt(opciones.length);
            String opcionPc = opciones[opcionInt];

            System.out.println("La computadora eligió: " + opcionPc);

            if (opcionUsuario.equals(opcionPc)) {
                System.out.println("Empate");
            } else if ((opcionUsuario.equals("piedra") && opcionPc.equals("tijera")) ||
                    (opcionUsuario.equals("papel") && opcionPc.equals("piedra")) ||
                    (opcionUsuario.equals("tijera") && opcionPc.equals("papel"))) {
                System.out.println("Ganaste, la computadora sacó: " + opcionPc);
            } else {
                System.out.println("La computadora gana, sacó: " + opcionPc);
            }
        } else {
            System.out.println("Opción no válida, ingrese piedra, papel o tijera");
        }
    }
}
