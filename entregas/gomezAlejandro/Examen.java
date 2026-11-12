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
        
        System.out.println ("Introduzca la nota de la asignatura 1 del 1-10: "); 
        int nota1 = scanner.nextInt();
        
        System.out.println ("Introduzca la nota de la asignatura 2 del 1-10: ");
        int nota2 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 3 del 1-10: ");
        int nota3 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 4 del 1-10: ");
        int nota4 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 5 del 1-10: ");
        int nota5 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 6 del 1-10: ");
        int nota6 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 7 del 1-10: ");
        int nota7 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 8 del 1-10: ");
        int nota8 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 9 del 1-10: ");
        int nota9 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 10 del 1-10: ");
        int nota10 = scanner.nextInt();
    

    }
}
