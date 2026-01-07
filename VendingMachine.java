import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- ELIGE TU PRODUCTO ---");
            System.out.println("1. Coca Cola (150 cts)");
            System.out.println("2. Doritos (120 cts)");
            System.out.println("3. Agua (80 cts)");
            System.out.println("4. Salir");
            
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo");
                break; 
            }

            String nombre = "";
            int precio = 0;
            boolean productoValido = false;

            if (opcion == 1) {
                nombre = "Coca Cola";
                precio = 150;
                productoValido = true;
            } else if (opcion == 2) {
                nombre = "Patatillas";
                precio = 120;
                productoValido = true;
            } else if (opcion == 3) {
                nombre = "Agua";
                precio = 80;
                productoValido = true;
            } else {
                System.out.println("Opcion no válida");
            }

            if (productoValido) {
                System.out.println("Has elegido: " + nombre);
                System.out.println("Precio: " + precio + " cts.");
                
                int pagado = 0;
                while (pagado < precio) {
                    int falta = precio - pagado;
                    System.out.print("Faltan " + falta + " cts. Inserta el dinero: ");
                    int moneda = scanner.nextInt();
                    if (moneda > 0) {
                        pagado += moneda;
                    }
                }

                System.out.println("Entregando " + nombre);
                
                if (pagado > precio) {
                    System.out.println("Tu cambio: " + (pagado - precio) + " cts.");
                }
            }
        }
        scanner.close();
    }
}