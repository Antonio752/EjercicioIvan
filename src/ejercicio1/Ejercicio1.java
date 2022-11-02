package ejercicio1;

import java.util.*;

public class Ejercicio1 {

    private static Animal animal;
    private static Presa presa;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String tipoAnimal, cadena;
        int opcion = 0;
        do {
            System.out.println("Elige una opcion: \n 1. Crear un perro\n 2. Crear un gato\n 0. Salir");
            cadena = entrada.nextLine();
            if (isNumeric(cadena) == true) {
                opcion = Integer.parseInt(cadena);
                switch (opcion) {
                    case 1:
                        tipoAnimal = "perro";
                        animal = crearAnimal(tipoAnimal);
                        emitirSonido(animal);
                        alimentar(animal);
                        break;
                    case 2:
                        tipoAnimal = "gato";
                        animal = crearAnimal(tipoAnimal);
                        emitirSonido(animal);
                        alimentar(animal);
                        break;
                }

            } else {
                System.out.println("No es un numero");
            }

        } while (opcion != 0);
    }

    public static void emitirSonido(Animal animal) {

        System.out.println(animal.emitirSonido());
    }
    
    public static void alimentar(Animal animal) {

        presa = (Presa) animal;
        System.out.println(presa.alimentar());
    }
    
    public static Animal crearAnimal(String tipoAnimal){
        animal = FactoriaAnimal.crearAnimal(tipoAnimal);
        return animal;
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
}