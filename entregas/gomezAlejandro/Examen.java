import java.util.Scanner;
public class Examen{ 
    public static void main (String [] args){
        
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println ("Su edad es " + edad);
        if ( edad < 18){
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }
    }
}
