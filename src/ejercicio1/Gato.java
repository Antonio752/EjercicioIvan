package ejercicio1;

public class Gato extends Presa implements Animal{
    
    @Override
    public String emitirSonido(){
        return "Guau, soy un gato";
    }
    
     @Override
    public String getAlimento(){
        String alimento = "Ratones";
        return alimento;     
    }
}
