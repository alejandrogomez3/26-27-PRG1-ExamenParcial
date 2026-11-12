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
       

        System.out.println("Ingrese su edad: ");
        int edad1 = scanner.nextInt();
        if ( edad1 >= 17 && edad1 <= 70){
            System.out.println("Edad válida");
        } 
        else {
            System.out.println("Edad no válida");
        }

        System.out.println("¿En qué asignaturas estás matriculado?");
        int asignaturas = scanner.nextInt();

        System.out.println("¿En qué asignaturas estás matriculado?");
        int asignaturas1 = scanner.nextInt();

        if ( asignaturas1 >= 1 && asignaturas1 <= 10){
            System.out.println("Aceptado");
        } 
        else {
            System.out.println("Error en la cantidad de asignaturas máximo 10 y mínimo 1");
        } 
    }
}
