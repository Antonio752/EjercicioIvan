package ejercicio1;

public abstract class Presa {

    private String alimento;

    public String alimentar() {
        return "Me alimento de " + getAlimento();
    }

    public String getAlimento() {
        return alimento;
    }
}
