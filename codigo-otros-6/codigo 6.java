public class Codigo6 {
    public static void main(String[] args) {
        int[] n = new int[20]; // Corregido el tipo de declaración del array

        // Generar y mostrar los números aleatorios
        for (int i = 0; i < 20; i++) {  // Corregido i+ a i++ para incrementar correctamente el índice
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }

        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        
        // Leer la entrada del usuario usando System.console()
        int opcion = Integer.parseInt(System.console().readLine()); 

        // Determinar el múltiplo según la opción del usuario
        int multiplo = (opcion == 1) ? 5 : 7;

        // Resaltar los múltiplos seleccionados
        for (int e : n) { 
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }
    }
}