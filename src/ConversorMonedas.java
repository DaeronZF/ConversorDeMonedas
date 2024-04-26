import java.io.IOException;
import java.util.Scanner;
public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                *************************************************
                BIENVENIDOS AL CONVERSOR DE MONEDAS 2024 ALURA!
                **************************************************
                1-Convertir de USD (Dolares) => a ARS (Peso Argentino).
                2-Convertir de ARS (Peso Argentino) => a USD (Dolares).
                3-Convertir de USD (Dolares) => a BOB (Peso Boliviano).
                4-Convertir de BOB (Peso Boliviano) => a USD (Dolares).
                5-Convertir de USD (Dolares) => a BRL (Real Brasileño).
                6-Convertir de BRL (Real Brasileño) => a USD (Dolares).
                7-Convertir de USD (Dolares) => a CLP (Peso Chileno).
                8-Convertir de CLP (Peso Chileno) => a USD (Dolares).
                9-Convertir de USD (Dolares) => a COP  (Peso Colombiano).
                10-Convertir de COP  (Peso Colombiano) => a USD (Dolares).
                11-Convertir de USD (Dolares) => a PEN  (Sol Peruano).
                12-Convertir de PEN  (Sol Peruano) => a USD (Dolares).
                13-Salir
                """;

        int opcion;
        int seguir;
        do {
            System.out.println(menu);
            System.out.println("Elija las Monedas que desea Convertir del Menu: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "ARS", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 2:
                    convertirMoneda("ARS", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? (1 o 2)");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 3:
                    convertirMoneda("USD", "BOB", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 4:
                    convertirMoneda("BOB", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 5:
                    convertirMoneda("USD", "BRL", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 6:
                    convertirMoneda("BRL", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 7:
                    convertirMoneda("USD", "CLP", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 8:
                    convertirMoneda("CLP", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 9:
                    convertirMoneda("USD", "COP", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 10:
                    convertirMoneda("COP", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 11:
                    convertirMoneda("USD", "PEN", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 12:
                    convertirMoneda("PEN", "USD", scanner);
                    System.out.println("Quiere seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 13;
                        break;
                    }
                case 13:
                    System.out.println("**********************************************************");
                    System.out.println(" ");
                    System.out.println("GRACIAS POR USAR NUESTRO CONVERSOR DE MONEDAS...");
                    System.out.println(" ");
                    System.out.println("***********************************************************");
                    break;
                default:
                    System.out.println("Opción no válida, elija una opción del menú.");
            }
        } while (opcion != 13);
        System.out.println("**********************************************************");
        System.out.println(" ");
        System.out.println("GRACIAS POR USAR NUESTRO CONVERSOR DE MONEDAS!");
        System.out.println(" ");
        System.out.println("***********************************************************");

        scanner.close();
    }

    private static void convertirMoneda(String baseCode, String targetCode, Scanner scanner) {
        System.out.println("Ingrese el monto total a convertir: ");
        double amount = scanner.nextDouble();
        Conversor conversion = new Conversor(baseCode, targetCode, amount);
        try {
            double result = conversion.convert();
            System.out.println(amount + " " + baseCode + " son " + result + " " + targetCode);
            System.out.println("********************************************************************");
            System.out.println("SU MONEDA A SIDO CONVERTIDA A LA OPCION DESEADA!");
            System.out.println("*********************************************************************");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}
