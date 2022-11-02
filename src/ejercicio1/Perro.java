package ejercicio1;

public class Perro extends Presa implements Animal{
    
    @Override
    public String emitirSonido(){     
        return "Guau, soy un perro";
    }
    
    @Override
    public String getAlimento(){
        String alimento = "Cordero";
        return alimento;     
    }
}
