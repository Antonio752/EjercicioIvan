package ejercicio1;

public class FactoriaAnimal {
    
    public static Animal crearAnimal(String tipoAnimal){
       
        if (tipoAnimal.equalsIgnoreCase("perro")) {
            return new Perro();
        }else{
            return new Gato();
        }
    }   
}
