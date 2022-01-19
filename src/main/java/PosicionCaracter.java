import java.util.Scanner;

public class PosicionCaracter {

    public static void caracterEn (String s, Integer n){
        try{
            System.out.println("Caracter: " + s.charAt(n));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }

    }

    public static void  main   (String[] args){
        Scanner scanner = new Scanner(System.in);

        String lectTeclado;
        int entero = 0;

            System.out.println("Cadena:");
            lectTeclado = scanner.nextLine();
            System.out.println("Posicion:");

            try {
                entero = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Error de formato en la segunda entrada");
                System.exit(0);
            }
            caracterEn(lectTeclado, entero);
    }

}
