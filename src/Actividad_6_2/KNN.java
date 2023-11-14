package Actividad_6_2;

public abstract class KNN {

    final void templateMethod() {
        observar();
        procesar();
        votar();
    }

    abstract void procesar();

    void observar() {
        System.out.println("Observando");
    }

    void votar() {
        System.out.println("Votando categoría");
    }
}
