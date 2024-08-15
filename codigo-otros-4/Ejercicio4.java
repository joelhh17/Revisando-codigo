package com.generation;

import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar entrada para jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase();
        
        // Solicitar entrada para  jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase();
        
        // Verificar empate
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2;
            
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                    
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                    
                default:
                    System.out.println("Entrada no válida");
                    return;
            }
            
            //resultado
            System.out.println("Gana el jugador " + ganador);
        }
        
        scanner.close();
    }
}