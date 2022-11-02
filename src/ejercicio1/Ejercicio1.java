package ejercicio1;

import java.util.*;

public class Ejercicio1 {

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
                        Animal perro = FactoriaAnimal.crearAnimal(tipoAnimal);
                        emitirSonido(perro);
                        alimentar(perro);
                        break;
                    case 2:
                        tipoAnimal = "gato";
                        Animal gato = FactoriaAnimal.crearAnimal(tipoAnimal);
                        emitirSonido(gato);
                        alimentar(gato);
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

        Presa presa = (Presa) animal;
        System.out.println(presa.alimentar());
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