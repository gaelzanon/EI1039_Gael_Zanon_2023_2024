package Actividad_6_2;

public class ContextSimple {
    private Classifier clasificador;
    private Distance metrica;

    public ContextSimple(Classifier clasificador) {
        this.clasificador = clasificador;
    }

    public ContextSimple(Distance metrica) {
        this.metrica = metrica;
    }

    public ContextSimple(Classifier clasificador, Distance metrica) {
        this.clasificador = clasificador;
        this.metrica = metrica;
    }

    public void setClassifierStrategy(Classifier clasificador) {
        this.clasificador = clasificador;
    }

    public void setDistanceMetric(Distance metrica) {
        this.metrica = metrica;
    }

    public void run() {
        metrica.execute();
        clasificador.execute();
    }
}
