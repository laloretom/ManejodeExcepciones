import java.util.Scanner;


public class MainApp {

    public static void validate (int numero) throws NumerosNegativosExcepcion {
        if (numero < 0){
            throw new NumerosNegativosExcepcion("El numero es negativo",
            new Throwable("Numero = " + numero));
        } else {
            System.out.println("La raiz cuadrada de " + numero + "  es: " + Math.sqrt(numero));
        }
    }

    public static void  main   (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        double resultado;
        System.out.println("Numero: ");

        try {
            numero = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Error de formato, no es un numero");
            System.exit(0);
        }

        try {
            validate(numero);
        }
        catch (NumerosNegativosExcepcion ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

    }
}
